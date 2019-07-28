package typings.jsoneditor

import typings.jsoneditor.jsoneditorMod.JSONEditorMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsoneditorStrings {
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait code extends JSONEditorMode
  
  @js.native
  sealed trait form extends JSONEditorMode
  
  @js.native
  sealed trait `object` extends js.Object
  
  @js.native
  sealed trait text extends JSONEditorMode
  
  @js.native
  sealed trait tree extends JSONEditorMode
  
  @js.native
  sealed trait view extends JSONEditorMode
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def form: form = "form".asInstanceOf[form]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def tree: tree = "tree".asInstanceOf[tree]
  @scala.inline
  def view: view = "view".asInstanceOf[view]
}

