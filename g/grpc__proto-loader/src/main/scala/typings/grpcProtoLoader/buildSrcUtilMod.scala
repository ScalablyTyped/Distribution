package typings.grpcProtoLoader

import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.IParseOptions
import typings.protobufjs.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilMod {
  
  @JSImport("@grpc/proto-loader/build/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCommonProtos(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommonProtos")().asInstanceOf[Unit]
  
  inline def loadProtosWithOptions(filename: String): js.Promise[Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptions")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Root]]
  inline def loadProtosWithOptions(filename: String, options: Options): js.Promise[Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptions")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Root]]
  inline def loadProtosWithOptions(filename: js.Array[String]): js.Promise[Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptions")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Root]]
  inline def loadProtosWithOptions(filename: js.Array[String], options: Options): js.Promise[Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptions")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Root]]
  
  inline def loadProtosWithOptionsSync(filename: String): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptionsSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def loadProtosWithOptionsSync(filename: String, options: Options): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptionsSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def loadProtosWithOptionsSync(filename: js.Array[String]): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptionsSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def loadProtosWithOptionsSync(filename: js.Array[String], options: Options): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProtosWithOptionsSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  trait Options
    extends StObject
       with IParseOptions
       with IConversionOptions {
    
    var includeDirs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludeDirs(value: js.Array[String]): Self = StObject.set(x, "includeDirs", value.asInstanceOf[js.Any])
      
      inline def setIncludeDirsUndefined: Self = StObject.set(x, "includeDirs", js.undefined)
      
      inline def setIncludeDirsVarargs(value: String*): Self = StObject.set(x, "includeDirs", js.Array(value*))
    }
  }
}
