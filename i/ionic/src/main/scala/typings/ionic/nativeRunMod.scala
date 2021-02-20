package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IShellRunOptions
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeRunMod {
  
  @JSImport("ionic/lib/native-run", "SUPPORTED_PLATFORMS")
  @js.native
  val SUPPORTED_PLATFORMS: js.Array[String] = js.native
  
  @JSImport("ionic/lib/native-run", "checkNativeRun")
  @js.native
  def checkNativeRun(hasConfig: CheckNativeRunDeps): js.Promise[Unit] = js.native
  
  @JSImport("ionic/lib/native-run", "createNativeRunArgs")
  @js.native
  def createNativeRunArgs(hasPackagePathPlatformForwardedPorts: NativeRunSchema, options: CommandLineOptions): js.Array[String] = js.native
  
  @JSImport("ionic/lib/native-run", "createNativeRunListArgs")
  @js.native
  def createNativeRunListArgs(inputs: js.Array[String], options: CommandLineOptions): js.Array[String] = js.native
  
  @JSImport("ionic/lib/native-run", "findNativeRun")
  @js.native
  def findNativeRun(): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("ionic/lib/native-run", "getNativeTargets")
  @js.native
  def getNativeTargets(hasLogShell: RunNativeRunDeps, platform: String): js.Promise[NativeTargetPlatform] = js.native
  
  @JSImport("ionic/lib/native-run", "runNativeRun")
  @js.native
  def runNativeRun(hasConfigLogShell: RunNativeRunDeps, args: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("ionic/lib/native-run", "runNativeRun")
  @js.native
  def runNativeRun(hasConfigLogShell: RunNativeRunDeps, args: js.Array[String], options: IShellRunOptions): js.Promise[Unit] = js.native
  
  @js.native
  trait CheckNativeRunDeps extends StObject {
    
    val config: IConfig = js.native
  }
  object CheckNativeRunDeps {
    
    @scala.inline
    def apply(config: IConfig): CheckNativeRunDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckNativeRunDeps]
    }
    
    @scala.inline
    implicit class CheckNativeRunDepsMutableBuilder[Self <: CheckNativeRunDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeDeviceTarget extends StObject {
    
    var id: String = js.native
    
    var model: String = js.native
    
    var platform: String = js.native
    
    var sdkVersion: String = js.native
  }
  object NativeDeviceTarget {
    
    @scala.inline
    def apply(id: String, model: String, platform: String, sdkVersion: String): NativeDeviceTarget = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDeviceTarget]
    }
    
    @scala.inline
    implicit class NativeDeviceTargetMutableBuilder[Self <: NativeDeviceTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeRunSchema extends StObject {
    
    var forwardedPorts: js.UndefOr[js.Array[String | Double]] = js.native
    
    var packagePath: String = js.native
    
    var platform: String = js.native
  }
  object NativeRunSchema {
    
    @scala.inline
    def apply(packagePath: String, platform: String): NativeRunSchema = {
      val __obj = js.Dynamic.literal(packagePath = packagePath.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeRunSchema]
    }
    
    @scala.inline
    implicit class NativeRunSchemaMutableBuilder[Self <: NativeRunSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardedPorts(value: js.Array[String | Double]): Self = StObject.set(x, "forwardedPorts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardedPortsUndefined: Self = StObject.set(x, "forwardedPorts", js.undefined)
      
      @scala.inline
      def setForwardedPortsVarargs(value: (String | Double)*): Self = StObject.set(x, "forwardedPorts", js.Array(value :_*))
      
      @scala.inline
      def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeTargetPlatform extends StObject {
    
    var devices: js.Array[NativeDeviceTarget] = js.native
    
    var virtualDevices: js.Array[NativeVirtualDeviceTarget] = js.native
  }
  object NativeTargetPlatform {
    
    @scala.inline
    def apply(devices: js.Array[NativeDeviceTarget], virtualDevices: js.Array[NativeVirtualDeviceTarget]): NativeTargetPlatform = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], virtualDevices = virtualDevices.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeTargetPlatform]
    }
    
    @scala.inline
    implicit class NativeTargetPlatformMutableBuilder[Self <: NativeTargetPlatform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevices(value: js.Array[NativeDeviceTarget]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicesVarargs(value: NativeDeviceTarget*): Self = StObject.set(x, "devices", js.Array(value :_*))
      
      @scala.inline
      def setVirtualDevices(value: js.Array[NativeVirtualDeviceTarget]): Self = StObject.set(x, "virtualDevices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualDevicesVarargs(value: NativeVirtualDeviceTarget*): Self = StObject.set(x, "virtualDevices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NativeVirtualDeviceTarget extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
    
    var platform: String = js.native
    
    var sdkVersion: String = js.native
  }
  object NativeVirtualDeviceTarget {
    
    @scala.inline
    def apply(id: String, name: String, platform: String, sdkVersion: String): NativeVirtualDeviceTarget = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeVirtualDeviceTarget]
    }
    
    @scala.inline
    implicit class NativeVirtualDeviceTargetMutableBuilder[Self <: NativeVirtualDeviceTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunNativeRunDeps extends StObject {
    
    val config: IConfig = js.native
    
    val log: ILogger = js.native
    
    val shell: IShell = js.native
  }
  object RunNativeRunDeps {
    
    @scala.inline
    def apply(config: IConfig, log: ILogger, shell: IShell): RunNativeRunDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunNativeRunDeps]
    }
    
    @scala.inline
    implicit class RunNativeRunDepsMutableBuilder[Self <: RunNativeRunDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
