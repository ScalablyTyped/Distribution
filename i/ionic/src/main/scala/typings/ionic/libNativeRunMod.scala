package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IShellRunOptions
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNativeRunMod {
  
  @JSImport("ionic/lib/native-run", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/native-run", "SUPPORTED_PLATFORMS")
  @js.native
  val SUPPORTED_PLATFORMS: js.Array[String] = js.native
  
  inline def checkNativeRun(param0: CheckNativeRunDeps): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNativeRun")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def createNativeRunArgs(param0: NativeRunSchema, options: CommandLineOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNativeRunArgs")(param0.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def createNativeRunListArgs(inputs: js.Array[String], options: CommandLineOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNativeRunListArgs")(inputs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def findNativeRun(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNativeRun")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getNativeTargets(param0: RunNativeRunDeps, platform: String): js.Promise[NativeTargetPlatform] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNativeTargets")(param0.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NativeTargetPlatform]]
  
  inline def runNativeRun(param0: RunNativeRunDeps, args: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runNativeRun")(param0.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def runNativeRun(param0: RunNativeRunDeps, args: js.Array[String], options: IShellRunOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runNativeRun")(param0.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait CheckNativeRunDeps extends StObject {
    
    val config: IConfig
  }
  object CheckNativeRunDeps {
    
    inline def apply(config: IConfig): CheckNativeRunDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckNativeRunDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckNativeRunDeps] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeDeviceTarget extends StObject {
    
    var id: String
    
    var model: String
    
    var platform: String
    
    var sdkVersion: String
  }
  object NativeDeviceTarget {
    
    inline def apply(id: String, model: String, platform: String, sdkVersion: String): NativeDeviceTarget = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDeviceTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeDeviceTarget] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeRunSchema extends StObject {
    
    var forwardedPorts: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var packagePath: String
    
    var platform: String
  }
  object NativeRunSchema {
    
    inline def apply(packagePath: String, platform: String): NativeRunSchema = {
      val __obj = js.Dynamic.literal(packagePath = packagePath.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeRunSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeRunSchema] (val x: Self) extends AnyVal {
      
      inline def setForwardedPorts(value: js.Array[String | Double]): Self = StObject.set(x, "forwardedPorts", value.asInstanceOf[js.Any])
      
      inline def setForwardedPortsUndefined: Self = StObject.set(x, "forwardedPorts", js.undefined)
      
      inline def setForwardedPortsVarargs(value: (String | Double)*): Self = StObject.set(x, "forwardedPorts", js.Array(value*))
      
      inline def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeTargetPlatform extends StObject {
    
    var devices: js.Array[NativeDeviceTarget]
    
    var virtualDevices: js.Array[NativeVirtualDeviceTarget]
  }
  object NativeTargetPlatform {
    
    inline def apply(devices: js.Array[NativeDeviceTarget], virtualDevices: js.Array[NativeVirtualDeviceTarget]): NativeTargetPlatform = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], virtualDevices = virtualDevices.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeTargetPlatform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeTargetPlatform] (val x: Self) extends AnyVal {
      
      inline def setDevices(value: js.Array[NativeDeviceTarget]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: NativeDeviceTarget*): Self = StObject.set(x, "devices", js.Array(value*))
      
      inline def setVirtualDevices(value: js.Array[NativeVirtualDeviceTarget]): Self = StObject.set(x, "virtualDevices", value.asInstanceOf[js.Any])
      
      inline def setVirtualDevicesVarargs(value: NativeVirtualDeviceTarget*): Self = StObject.set(x, "virtualDevices", js.Array(value*))
    }
  }
  
  trait NativeVirtualDeviceTarget extends StObject {
    
    var id: String
    
    var name: String
    
    var platform: String
    
    var sdkVersion: String
  }
  object NativeVirtualDeviceTarget {
    
    inline def apply(id: String, name: String, platform: String, sdkVersion: String): NativeVirtualDeviceTarget = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeVirtualDeviceTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeVirtualDeviceTarget] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunNativeRunDeps extends StObject {
    
    val config: IConfig
    
    val log: ILogger
    
    val shell: IShell
  }
  object RunNativeRunDeps {
    
    inline def apply(config: IConfig, log: ILogger, shell: IShell): RunNativeRunDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunNativeRunDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunNativeRunDeps] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
