package typings.griddleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ColumnDefinition: org.scalablytyped.runtime.Instantiable0[typings.griddleReact.mod.components.ColumnDefinition] = typings.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ColumnDefinition").asInstanceOf[org.scalablytyped.runtime.Instantiable0[typings.griddleReact.mod.components.ColumnDefinition]]
  
  @scala.inline
  def RowDefinition: org.scalablytyped.runtime.Instantiable0[typings.griddleReact.mod.components.RowDefinition] = typings.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RowDefinition").asInstanceOf[org.scalablytyped.runtime.Instantiable0[typings.griddleReact.mod.components.RowDefinition]]
  
  type ColumnRenderProperties = typings.griddleReact.mod.components.ColumnDefinitionProps
  
  type Griddle[T] = typings.react.mod.Component[typings.griddleReact.mod.GriddleProps[T], js.Any, js.Any]
  
  type GriddleComponent[T] = (typings.react.mod.ComponentClass[T, typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[T]
  
  type GriddleFilter = java.lang.String | typings.griddleReact.mod.RowFilter | (typings.griddleReact.mod.PropertyBag[java.lang.String | typings.griddleReact.mod.RowFilter])
  
  type Listener = js.Function3[
    /* prevState */ js.Any, 
    /* nextState */ js.Any, 
    /* otherArgs */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type PropertyBag[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Reducer = js.Function2[/* state */ js.Any, /* action */ js.UndefOr[js.Any], scala.Unit]
  
  type RowFilter = js.Function3[
    /* row */ js.Any, 
    /* index */ scala.Double, 
    /* data */ typings.immutable.Immutable.List[js.Any], 
    scala.Boolean
  ]
  
  type RowRenderProperties = typings.griddleReact.mod.components.RowDefinitionProps
  
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
  
  @scala.inline
  def actions: typings.griddleReact.mod.GriddleActions = typings.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[typings.griddleReact.mod.GriddleActions]
  
  @scala.inline
  def connect: typings.reactRedux.mod.Connect_[typings.reactRedux.mod.DefaultRootState] = typings.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("connect").asInstanceOf[typings.reactRedux.mod.Connect_[typings.reactRedux.mod.DefaultRootState]]
  
  @scala.inline
  def constants: typings.griddleReact.mod.PropertyBag[java.lang.String] = typings.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("constants").asInstanceOf[typings.griddleReact.mod.PropertyBag[java.lang.String]]
  
  @scala.inline
  def selectors: typings.griddleReact.mod.PropertyBag[typings.griddleReact.mod.Selector] = typings.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("selectors").asInstanceOf[typings.griddleReact.mod.PropertyBag[typings.griddleReact.mod.Selector]]
  
  @scala.inline
  def settingsComponentObjects: typings.griddleReact.mod.PropertyBag[typings.griddleReact.mod.SettingsComponentObject] = typings.griddleReact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("settingsComponentObjects").asInstanceOf[typings.griddleReact.mod.PropertyBag[typings.griddleReact.mod.SettingsComponentObject]]
}
