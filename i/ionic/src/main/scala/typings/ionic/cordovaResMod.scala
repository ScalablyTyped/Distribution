package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IShellRunOptions
import typings.ionic.definitionsMod.NpmClient
import typings.ionic.errorsMod.FatalException
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaResMod {
  
  @JSImport("ionic/lib/cordova-res", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/cordova-res", "SUPPORTED_PLATFORMS")
  @js.native
  val SUPPORTED_PLATFORMS: js.Array[String] = js.native
  
  @scala.inline
  def checkCordovaRes(hasConfig: CheckCordovaResDeps): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCordovaRes")(hasConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def createCordovaResArgs(hasPlatform: CordovaResSchema, options: CommandLineOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCordovaResArgs")(hasPlatform.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def createCordovaResNotFoundError(npmClient: NpmClient): js.Promise[FatalException] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCordovaResNotFoundError")(npmClient.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FatalException]]
  
  @scala.inline
  def createCordovaResNotFoundMessage(npmClient: NpmClient): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCordovaResNotFoundMessage")(npmClient.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def findCordovaRes(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCordovaRes")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @scala.inline
  def runCordovaRes(hasConfigLogShell: RunCordovaResDeps, args: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCordovaRes")(hasConfigLogShell.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def runCordovaRes(hasConfigLogShell: RunCordovaResDeps, args: js.Array[String], options: IShellRunOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCordovaRes")(hasConfigLogShell.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait CheckCordovaResDeps extends StObject {
    
    val config: IConfig
  }
  object CheckCordovaResDeps {
    
    @scala.inline
    def apply(config: IConfig): CheckCordovaResDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckCordovaResDeps]
    }
    
    @scala.inline
    implicit class CheckCordovaResDepsMutableBuilder[Self <: CheckCordovaResDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait CordovaResSchema extends StObject {
    
    var platform: js.UndefOr[String] = js.undefined
  }
  object CordovaResSchema {
    
    @scala.inline
    def apply(): CordovaResSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CordovaResSchema]
    }
    
    @scala.inline
    implicit class CordovaResSchemaMutableBuilder[Self <: CordovaResSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  trait RunCordovaResDeps extends StObject {
    
    val config: IConfig
    
    val log: ILogger
    
    val shell: IShell
  }
  object RunCordovaResDeps {
    
    @scala.inline
    def apply(config: IConfig, log: ILogger, shell: IShell): RunCordovaResDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunCordovaResDeps]
    }
    
    @scala.inline
    implicit class RunCordovaResDepsMutableBuilder[Self <: RunCordovaResDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
