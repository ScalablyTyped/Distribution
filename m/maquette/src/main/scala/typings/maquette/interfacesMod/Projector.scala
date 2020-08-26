package typings.maquette.interfacesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projector extends ProjectorService {
  /**
    * Appends a new child node to the DOM using the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param parentNode - The parent node for the new child node.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def append(parentNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
  /**
    * Stops running the `renderFunction` to update the DOM. The `renderFunction` must have been
    * registered using [[append]], [[merge]], [[insertBefore]] or [[replace]].
    *
    * @returns The [[Projection]] which was created using this `renderFunction`.
    * The [[Projection]] contains a reference to the DOM Node that was rendered.
    */
  def detach(renderFunction: js.Function0[VNode]): Projection = js.native
  /**
    * Inserts a new DOM node using the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param beforeNode - The node that the DOM Node is inserted before.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def insertBefore(beforeNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
  /**
    * Merges a new DOM node using the result from the provided `renderFunction` with an existing DOM Node.
    * This means that the virtual DOM and real DOM have one overlapping element.
    * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param domNode - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def merge(domNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
  /**
    * Replaces an existing DOM node with the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param domNode - The DOM node to replace.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def replace(domNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
  /**
    * Resumes the projector. Use this method to resume rendering after [[stop]] was called or an error occurred during rendering.
    */
  def resume(): Unit = js.native
  /**
    * Stops the projector. This means that the registered `render` functions will not be called anymore.
    *
    * Note that calling [[stop]] is not mandatory. A projector is a passive object that will get garbage collected
    * as usual if it is no longer in scope.
    */
  def stop(): Unit = js.native
}

object Projector {
  @scala.inline
  def apply(
    append: (Element, js.Function0[VNode]) => Unit,
    detach: js.Function0[VNode] => Projection,
    insertBefore: (Element, js.Function0[VNode]) => Unit,
    merge: (Element, js.Function0[VNode]) => Unit,
    renderNow: () => Unit,
    replace: (Element, js.Function0[VNode]) => Unit,
    resume: () => Unit,
    scheduleRender: () => Unit,
    stop: () => Unit
  ): Projector = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), detach = js.Any.fromFunction1(detach), insertBefore = js.Any.fromFunction2(insertBefore), merge = js.Any.fromFunction2(merge), renderNow = js.Any.fromFunction0(renderNow), replace = js.Any.fromFunction2(replace), resume = js.Any.fromFunction0(resume), scheduleRender = js.Any.fromFunction0(scheduleRender), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Projector]
  }
  @scala.inline
  implicit class ProjectorOps[Self <: Projector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(value: (Element, js.Function0[VNode]) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
    @scala.inline
    def setDetach(value: js.Function0[VNode] => Projection): Self = this.set("detach", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertBefore(value: (Element, js.Function0[VNode]) => Unit): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setMerge(value: (Element, js.Function0[VNode]) => Unit): Self = this.set("merge", js.Any.fromFunction2(value))
    @scala.inline
    def setReplace(value: (Element, js.Function0[VNode]) => Unit): Self = this.set("replace", js.Any.fromFunction2(value))
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

