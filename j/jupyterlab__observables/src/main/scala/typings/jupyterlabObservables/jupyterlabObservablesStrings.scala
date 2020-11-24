package typings.jupyterlabObservables

import typings.jupyterlabObservables.modeldbMod.ObservableType
import typings.jupyterlabObservables.observablemapMod.IObservableMap.ChangeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabObservablesStrings {
  
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
  
  @js.native
  sealed trait List extends ObservableType
  
  @js.native
  sealed trait Map extends ObservableType
  
  @js.native
  sealed trait String extends ObservableType
  
  @js.native
  sealed trait Value extends ObservableType
  
  @js.native
  sealed trait add
    extends ChangeType
       with typings.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
  
  @js.native
  sealed trait change extends ChangeType
  
  @js.native
  sealed trait insert
    extends typings.jupyterlabObservables.observablestringMod.IObservableString.ChangeType
  
  @js.native
  sealed trait move
    extends typings.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
  
  @js.native
  sealed trait remove
    extends ChangeType
       with typings.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
       with typings.jupyterlabObservables.observablestringMod.IObservableString.ChangeType
  
  @js.native
  sealed trait set
    extends typings.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
       with typings.jupyterlabObservables.observablestringMod.IObservableString.ChangeType
}
