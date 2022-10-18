package typings.griddleReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.mod.^
import typings.griddleReact.mod.components.ColumnDefinitionProps
import typings.griddleReact.mod.components.RowDefinitionProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactRedux.esComponentsConnectMod.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def actions: GriddleActions = ^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[GriddleActions]

inline def connect: Connect[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("connect").asInstanceOf[Connect[Any]]

inline def constants: PropertyBag[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("constants").asInstanceOf[PropertyBag[String]]

inline def selectors: PropertyBag[Selector] = ^.asInstanceOf[js.Dynamic].selectDynamic("selectors").asInstanceOf[PropertyBag[Selector]]

inline def settingsComponentObjects: PropertyBag[SettingsComponentObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("settingsComponentObjects").asInstanceOf[PropertyBag[SettingsComponentObject]]

type ColumnRenderProperties = ColumnDefinitionProps

type Griddle[T] = Component[GriddleProps[T], Any, Any]

type GriddleComponent[T] = (ComponentClass[T, ComponentState]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<T> */ Any)

type GriddleFilter = String | RowFilter | (PropertyBag[String | RowFilter])

type Listener = js.Function3[/* prevState */ Any, /* nextState */ Any, /* otherArgs */ js.UndefOr[Any], Any]

type PropertyBag[T] = StringDictionary[T]

type Reducer = js.Function2[/* state */ Any, /* action */ js.UndefOr[Any], Unit]

type RowFilter = js.Function3[/* row */ Any, /* index */ Double, /* data */ typings.immutable.mod.List[Any], Boolean]

type RowRenderProperties = RowDefinitionProps

type Selector = js.Function2[/* state */ Any, /* props */ js.UndefOr[Any], Any]
