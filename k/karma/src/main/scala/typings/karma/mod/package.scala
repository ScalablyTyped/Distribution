package typings.karma.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.karma.karmaStrings.`type`
import typings.karma.karmaStrings.factory
import typings.karma.karmaStrings.value
import typings.karma.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

inline def runner: Runner_ = ^.asInstanceOf[js.Dynamic].selectDynamic("runner").asInstanceOf[Runner_]

inline def stopper: Stopper_ = ^.asInstanceOf[js.Dynamic].selectDynamic("stopper").asInstanceOf[Stopper_]

type ConstructorFn = js.Function | (Instantiable1[/* params (repeated) */ Any, Any])

type ConstructorFnType = js.Tuple2[`type`, ConstructorFn]

type FactoryFnType = js.Tuple2[factory, FactoryFn]

type InlinePluginDef = Record[PluginName, InlinePluginType]

type InlinePluginType = FactoryFnType | ConstructorFnType | ValueType

type PathProxyPairs = StringDictionary[String | ProxyOptions]

type PluginName = String

type ServerCallback = js.Function1[/* exitCode */ Double, Unit]

type ValueType = js.Tuple2[value, Any]
