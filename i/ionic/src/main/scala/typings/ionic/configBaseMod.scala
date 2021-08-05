package typings.ionic

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.anon.OriginalValue
import typings.ionic.anon.Property
import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProjectConfig
import typings.ionic.ionicBooleans.`false`
import typings.ionic.ionicBooleans.`true`
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configBaseMod {
  
  @JSImport("ionic/commands/config/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/commands/config/base", "BaseConfigCommand")
  @js.native
  abstract class BaseConfigCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def generateContext(inputs: CommandLineInputs, options: CommandLineOptions): ConfigContext = js.native
    
    def interpretValue(): js.Any = js.native
    def interpretValue(v: String): js.Any = js.native
    def interpretValue(v: String, expectJson: Boolean): js.Any = js.native
    def interpretValue(v: Unit, expectJson: Boolean): js.Any = js.native
    
    def jsonStringify(v: js.Any): String = js.native
  }
  
  inline def getConfig(ctx: ConfigContext): FlexibleConfigFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(ctx.asInstanceOf[js.Any]).asInstanceOf[FlexibleConfigFile]
  
  inline def getConfigValue(ctx: ConfigContext): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigValue")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def setConfigValue(ctx: ConfigContext & OriginalValue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfigValue")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unsetConfigValue(ctx: ConfigContext & Property): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetConfigValue")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BaseConfigContext extends StObject {
    
    var force: Boolean
    
    var json: Boolean
    
    var property: js.UndefOr[String] = js.undefined
    
    var root: Boolean
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object BaseConfigContext {
    
    inline def apply(force: Boolean, json: Boolean, root: Boolean): BaseConfigContext = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseConfigContext]
    }
    
    extension [Self <: BaseConfigContext](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.configBaseMod.GlobalConfigContext
    - typings.ionic.configBaseMod.ProjectConfigContext
  */
  trait ConfigContext extends StObject
  object ConfigContext {
    
    inline def GlobalConfigContext(config: IConfig, force: Boolean, json: Boolean, root: Boolean): typings.ionic.configBaseMod.GlobalConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = true, json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.configBaseMod.GlobalConfigContext]
    }
    
    inline def ProjectConfigContext(config: BaseConfig[IProjectConfig], force: Boolean, json: Boolean, root: Boolean): typings.ionic.configBaseMod.ProjectConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = false, json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.configBaseMod.ProjectConfigContext]
    }
  }
  
  type FlexibleConfigFile = StringDictionary[js.Any]
  
  trait GlobalConfigContext
    extends StObject
       with BaseConfigContext
       with ConfigContext {
    
    var config: IConfig
    
    var global: `true`
  }
  object GlobalConfigContext {
    
    inline def apply(config: IConfig, force: Boolean, json: Boolean, root: Boolean): GlobalConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = true, json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalConfigContext]
    }
    
    extension [Self <: GlobalConfigContext](x: Self) {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: `true`): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectConfigContext
    extends StObject
       with BaseConfigContext
       with ConfigContext {
    
    var config: BaseConfig[IProjectConfig]
    
    var global: `false`
  }
  object ProjectConfigContext {
    
    inline def apply(config: BaseConfig[IProjectConfig], force: Boolean, json: Boolean, root: Boolean): ProjectConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = false, json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectConfigContext]
    }
    
    extension [Self <: ProjectConfigContext](x: Self) {
      
      inline def setConfig(value: BaseConfig[IProjectConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: `false`): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
}
