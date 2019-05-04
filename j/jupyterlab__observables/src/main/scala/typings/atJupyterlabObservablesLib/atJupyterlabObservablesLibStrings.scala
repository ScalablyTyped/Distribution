package typings
package atJupyterlabObservablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabObservablesLibStrings {
  @js.native
  sealed trait List
    extends atJupyterlabObservablesLib.libModeldbMod.ObservableType
  
  @js.native
  sealed trait Map
    extends atJupyterlabObservablesLib.libModeldbMod.ObservableType
  
  @js.native
  sealed trait String
    extends atJupyterlabObservablesLib.libModeldbMod.ObservableType
  
  @js.native
  sealed trait Value
    extends atJupyterlabObservablesLib.libModeldbMod.ObservableType
  
  @js.native
  sealed trait add
    extends atJupyterlabObservablesLib.libObservablelistMod.IObservableListNs.ChangeType
       with atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.ChangeType
  
  @js.native
  sealed trait change
    extends atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.ChangeType
  
  @js.native
  sealed trait insert
    extends atJupyterlabObservablesLib.libObservablestringMod.IObservableStringNs.ChangeType
  
  @js.native
  sealed trait move
    extends atJupyterlabObservablesLib.libObservablelistMod.IObservableListNs.ChangeType
  
  @js.native
  sealed trait remove
    extends atJupyterlabObservablesLib.libObservablelistMod.IObservableListNs.ChangeType
       with atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.ChangeType
       with atJupyterlabObservablesLib.libObservablestringMod.IObservableStringNs.ChangeType
  
  @js.native
  sealed trait set
    extends atJupyterlabObservablesLib.libObservablelistMod.IObservableListNs.ChangeType
       with atJupyterlabObservablesLib.libObservablestringMod.IObservableStringNs.ChangeType
  
  @scala.inline
  def List: List = "List".asInstanceOf[List]
  @scala.inline
  def Map: Map = "Map".asInstanceOf[Map]
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  @scala.inline
  def Value: Value = "Value".asInstanceOf[Value]
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
}

