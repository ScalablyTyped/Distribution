package typings.jsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonPatchStrings {
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @scala.inline
  def test: test = "test".asInstanceOf[test]
  
  @js.native
  sealed trait add extends js.Object
  
  @js.native
  sealed trait copy extends js.Object
  
  @js.native
  sealed trait move extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait test extends js.Object
}
