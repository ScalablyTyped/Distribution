package typings.jupyterlabObservables

import typings.jupyterlabObservables.libModeldbMod.ObservableType
import typings.jupyterlabObservables.libObservablelistMod.IObservableList.ChangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabObservablesStrings {
  
  @js.native
  sealed trait List
    extends StObject
       with ObservableType
  inline def List: List = "List".asInstanceOf[List]
  
  @js.native
  sealed trait Map
    extends StObject
       with ObservableType
  inline def Map: Map = "Map".asInstanceOf[Map]
  
  @js.native
  sealed trait String
    extends StObject
       with ObservableType
  inline def String: String = "String".asInstanceOf[String]
  
  @js.native
  sealed trait Value
    extends StObject
       with ObservableType
  inline def Value: Value = "Value".asInstanceOf[Value]
  
  @js.native
  sealed trait add
    extends StObject
       with ChangeType
       with typings.jupyterlabObservables.libObservablemapMod.IObservableMap.ChangeType
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait change
    extends StObject
       with typings.jupyterlabObservables.libObservablemapMod.IObservableMap.ChangeType
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait insert
    extends StObject
       with typings.jupyterlabObservables.libObservablestringMod.IObservableString.ChangeType
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait move
    extends StObject
       with ChangeType
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait remove
    extends StObject
       with ChangeType
       with typings.jupyterlabObservables.libObservablemapMod.IObservableMap.ChangeType
       with typings.jupyterlabObservables.libObservablestringMod.IObservableString.ChangeType
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait set
    extends StObject
       with ChangeType
       with typings.jupyterlabObservables.libObservablestringMod.IObservableString.ChangeType
  inline def set: set = "set".asInstanceOf[set]
}
