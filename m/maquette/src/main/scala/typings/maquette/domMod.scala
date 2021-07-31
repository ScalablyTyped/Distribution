package typings.maquette

import typings.maquette.interfacesMod.Projection
import typings.maquette.interfacesMod.ProjectionOptions
import typings.maquette.interfacesMod.VNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("maquette/dist/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/dom", "applyDefaultProjectionOptions")
  @js.native
  def applyDefaultProjectionOptions: js.Function1[/* projectorOptions */ js.UndefOr[ProjectionOptions], ProjectionOptions] = js.native
  @scala.inline
  def applyDefaultProjectionOptions_=(x: js.Function1[/* projectorOptions */ js.UndefOr[ProjectionOptions], ProjectionOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applyDefaultProjectionOptions")(x.asInstanceOf[js.Any])
  
  object dom {
    
    @JSImport("maquette/dist/dom", "dom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appends a new child node to the DOM which is generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param parentNode - The parent node for the new child node.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    @scala.inline
    def append(parentNode: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(parentNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    @scala.inline
    def append(parentNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(parentNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
    /**
      * Creates a real DOM tree from `vnode`. The [[Projection]] object returned will contain the resulting DOM Node in
      * its [[Projection.domNode|domNode]] property.
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection.
      * @returns The [[Projection]] which also contains the DOM Node that was created.
      */
    @scala.inline
    def create(vnode: VNode): Projection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any]).asInstanceOf[Projection]
    @scala.inline
    def create(vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
    /**
      * Inserts a new DOM node which is generated from a [[VNode]].
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param beforeNode - The node that the DOM Node is inserted before.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function.
      * NOTE: [[VNode]] objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    @scala.inline
    def insertBefore(beforeNode: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(beforeNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    @scala.inline
    def insertBefore(beforeNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(beforeNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
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
    @scala.inline
    def merge(element: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    @scala.inline
    def merge(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
    /**
      * Replaces an existing DOM node with a node generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param element - The node for the [[VNode]] to replace.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    @scala.inline
    def replace(element: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    @scala.inline
    def replace(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
  }
}
