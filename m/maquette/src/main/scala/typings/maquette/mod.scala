package typings.maquette

import typings.maquette.interfacesMod.CalculationCache
import typings.maquette.interfacesMod.Mapping
import typings.maquette.interfacesMod.Projection
import typings.maquette.interfacesMod.ProjectionOptions
import typings.maquette.interfacesMod.Projector
import typings.maquette.interfacesMod.ProjectorOptions
import typings.maquette.interfacesMod.VNode
import typings.maquette.interfacesMod.VNodeChild
import typings.maquette.interfacesMod.VNodeProperties
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var createCache: js.Function0[CalculationCache[js.Any]] = js.native
  var createMapping: js.Function3[
    /* getSourceKey */ js.Function1[/* source */ js.Any, String | Double], 
    /* createResult */ js.Function2[/* source */ js.Any, /* index */ Double, js.Any], 
    /* updateResult */ js.Function3[/* source */ js.Any, /* target */ js.Any, /* index */ Double, Unit], 
    Mapping[js.Any, js.Any]
  ] = js.native
  var createProjector: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector] = js.native
  def h(selector: String): VNode = js.native
  def h(selector: String, children: js.Array[VNodeChild]): VNode = js.native
  def h(selector: String, properties: VNodeProperties): VNode = js.native
  def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = js.native
  @js.native
  object dom extends js.Object {
    /**
      * Appends a new child node to the DOM which is generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param parentNode - The parent node for the new child node.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    def append(parentNode: Element, vnode: VNode): Projection = js.native
    def append(parentNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    /**
      * Creates a real DOM tree from `vnode`. The [[Projection]] object returned will contain the resulting DOM Node in
      * its [[Projection.domNode|domNode]] property.
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection.
      * @returns The [[Projection]] which also contains the DOM Node that was created.
      */
    def create(vnode: VNode): Projection = js.native
    def create(vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    /**
      * Inserts a new DOM node which is generated from a [[VNode]].
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param beforeNode - The node that the DOM Node is inserted before.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function.
      * NOTE: [[VNode]] objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    def insertBefore(beforeNode: Element, vnode: VNode): Projection = js.native
    def insertBefore(beforeNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    /**
      * Merges a new DOM node which is generated from a [[VNode]] with an existing DOM Node.
      * This means that the virtual DOM and the real DOM will have one overlapping element.
      * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided.
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param element - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]] objects
      * may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    def merge(element: Element, vnode: VNode): Projection = js.native
    def merge(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    /**
      * Replaces an existing DOM node with a node generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param element - The node for the [[VNode]] to replace.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    def replace(element: Element, vnode: VNode): Projection = js.native
    def replace(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
  }
  
}

