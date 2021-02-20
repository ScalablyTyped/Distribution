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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configBaseMod {
  
  @JSImport("ionic/commands/config/base", "BaseConfigCommand")
  @js.native
  abstract class BaseConfigCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def generateContext(inputs: CommandLineInputs, options: CommandLineOptions): ConfigContext = js.native
    
    def interpretValue(): js.Any = js.native
    def interpretValue(v: js.UndefOr[scala.Nothing], expectJson: Boolean): js.Any = js.native
    def interpretValue(v: String): js.Any = js.native
    def interpretValue(v: String, expectJson: Boolean): js.Any = js.native
    
    def jsonStringify(v: js.Any): String = js.native
  }
  
  @JSImport("ionic/commands/config/base", "getConfig")
  @js.native
  def getConfig(ctx: ConfigContext): FlexibleConfigFile = js.native
  
  @JSImport("ionic/commands/config/base", "getConfigValue")
  @js.native
  def getConfigValue(ctx: ConfigContext): js.Any = js.native
  
  @JSImport("ionic/commands/config/base", "setConfigValue")
  @js.native
  def setConfigValue(ctx: ConfigContext with OriginalValue): Unit = js.native
  
  @JSImport("ionic/commands/config/base", "unsetConfigValue")
  @js.native
  def unsetConfigValue(ctx: ConfigContext with Property): Unit = js.native
  
  @js.native
  trait BaseConfigContext extends StObject {
    
    var force: Boolean = js.native
    
    var json: Boolean = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var root: Boolean = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object BaseConfigContext {
    
    @scala.inline
    def apply(force: Boolean, json: Boolean, root: Boolean): BaseConfigContext = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseConfigContext]
    }
    
    @scala.inline
    implicit class BaseConfigContextMutableBuilder[Self <: BaseConfigContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.configBaseMod.GlobalConfigContext
    - typings.ionic.configBaseMod.ProjectConfigContext
  */
  trait ConfigContext extends StObject
  object ConfigContext {
    
    @scala.inline
    def GlobalConfigContext(config: IConfig, force: Boolean, global: `true`, json: Boolean, root: Boolean): typings.ionic.configBaseMod.GlobalConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.configBaseMod.GlobalConfigContext]
    }
    
    @scala.inline
    def ProjectConfigContext(config: BaseConfig[IProjectConfig], force: Boolean, global: `false`, json: Boolean, root: Boolean): typings.ionic.configBaseMod.ProjectConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ionic.configBaseMod.ProjectConfigContext]
    }
  }
  
  type FlexibleConfigFile = StringDictionary[js.Any]
  
  @js.native
  trait GlobalConfigContext
    extends BaseConfigContext
       with ConfigContext {
    
    var config: IConfig = js.native
    
    var global: `true` = js.native
  }
  object GlobalConfigContext {
    
    @scala.inline
    def apply(config: IConfig, force: Boolean, global: `true`, json: Boolean, root: Boolean): GlobalConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalConfigContext]
    }
    
    @scala.inline
    implicit class GlobalConfigContextMutableBuilder[Self <: GlobalConfigContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: `true`): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectConfigContext
    extends BaseConfigContext
       with ConfigContext {
    
    var config: BaseConfig[IProjectConfig] = js.native
    
    var global: `false` = js.native
  }
  object ProjectConfigContext {
    
    @scala.inline
    def apply(config: BaseConfig[IProjectConfig], force: Boolean, global: `false`, json: Boolean, root: Boolean): ProjectConfigContext = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectConfigContext]
    }
    
    @scala.inline
    implicit class ProjectConfigContextMutableBuilder[Self <: ProjectConfigContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: BaseConfig[IProjectConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: `false`): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
}
