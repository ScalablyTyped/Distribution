package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projector extends ProjectorService {
  /**
    * Appends a new child node to the DOM using the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param parentNode - The parent node for the new child node.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def append(parentNode: stdLib.Element, renderFunction: js.Function0[VNode]): scala.Unit
  /**
    * Stops running the `renderFunction` to update the DOM. The `renderFunction` must have been
    * registered using [[append]], [[merge]], [[insertBefore]] or [[replace]].
    *
    * @returns The [[Projection]] which was created using this `renderFunction`.
    * The [[Projection]] contains a reference to the DOM Node that was rendered.
    */
  def detach(renderFunction: js.Function0[VNode]): Projection
  /**
    * Inserts a new DOM node using the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param beforeNode - The node that the DOM Node is inserted before.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def insertBefore(beforeNode: stdLib.Element, renderFunction: js.Function0[VNode]): scala.Unit
  /**
    * Merges a new DOM node using the result from the provided `renderFunction` with an existing DOM Node.
    * This means that the virtual DOM and real DOM have one overlapping element.
    * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param domNode - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def merge(domNode: stdLib.Element, renderFunction: js.Function0[VNode]): scala.Unit
  /**
    * Replaces an existing DOM node with the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param domNode - The DOM node to replace.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def replace(domNode: stdLib.Element, renderFunction: js.Function0[VNode]): scala.Unit
  /**
    * Resumes the projector. Use this method to resume rendering after [[stop]] was called or an error occurred during rendering.
    */
  def resume(): scala.Unit
  /**
    * Stops the projector. This means that the registered `render` functions will not be called anymore.
    *
    * Note that calling [[stop]] is not mandatory. A projector is a passive object that will get garbage collected
    * as usual if it is no longer in scope.
    */
  def stop(): scala.Unit
}

object Projector {
  @scala.inline
  def apply(
    append: (stdLib.Element, js.Function0[VNode]) => scala.Unit,
    detach: js.Function0[VNode] => Projection,
    insertBefore: (stdLib.Element, js.Function0[VNode]) => scala.Unit,
    merge: (stdLib.Element, js.Function0[VNode]) => scala.Unit,
    renderNow: () => scala.Unit,
    replace: (stdLib.Element, js.Function0[VNode]) => scala.Unit,
    resume: () => scala.Unit,
    scheduleRender: () => scala.Unit,
    stop: () => scala.Unit
  ): Projector = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), detach = js.Any.fromFunction1(detach), insertBefore = js.Any.fromFunction2(insertBefore), merge = js.Any.fromFunction2(merge), renderNow = js.Any.fromFunction0(renderNow), replace = js.Any.fromFunction2(replace), resume = js.Any.fromFunction0(resume), scheduleRender = js.Any.fromFunction0(scheduleRender), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Projector]
  }
}

