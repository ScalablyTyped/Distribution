package typings.karma

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConstructorFn = js.Function | (org.scalablytyped.runtime.Instantiable1[/* params (repeated) */ js.Any, js.Any])
  
  type ConstructorFnType = js.Tuple2[typings.karma.karmaStrings.`type`, typings.karma.mod.ConstructorFn]
  
  type FactoryFn = js.Function1[/* repeated */ js.Any, js.Any]
  
  type FactoryFnType = js.Tuple2[typings.karma.karmaStrings.factory, typings.karma.mod.FactoryFn]
  
  type InlinePluginDef = typings.std.Record[typings.karma.mod.PluginName, typings.karma.mod.InlinePluginType]
  
  type InlinePluginType = typings.karma.mod.FactoryFnType | typings.karma.mod.ConstructorFnType | typings.karma.mod.ValueType
  
  type PathProxyPairs = org.scalablytyped.runtime.StringDictionary[java.lang.String | typings.karma.mod.ProxyOptions]
  
  type PluginName = java.lang.String
  
  type ServerCallback = js.Function1[/* exitCode */ scala.Double, scala.Unit]
  
  @scala.inline
  def VERSION: java.lang.String = typings.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
  type ValueType = js.Tuple2[typings.karma.karmaStrings.value, js.Any]
  
  @scala.inline
  def runner: typings.karma.mod.Runner_ = typings.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("runner").asInstanceOf[typings.karma.mod.Runner_]
  
  @scala.inline
  def server: typings.karma.mod.DeprecatedServer = typings.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("server").asInstanceOf[typings.karma.mod.DeprecatedServer]
  
  @scala.inline
  def stopper: typings.karma.mod.Stopper_ = typings.karma.mod.^.asInstanceOf[js.Dynamic].selectDynamic("stopper").asInstanceOf[typings.karma.mod.Stopper_]
}
