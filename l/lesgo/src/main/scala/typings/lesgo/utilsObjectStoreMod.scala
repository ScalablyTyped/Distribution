package typings.lesgo

import typings.awsSdk.clientsS3Mod.BucketName
import typings.awsSdk.clientsS3Mod.GetObjectOutput
import typings.awsSdk.clientsS3Mod.ObjectKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsObjectStoreMod {
  
  @JSImport("lesgo/utils/objectStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lesgo/utils/objectStore", JSImport.Default)
  @js.native
  val default: typings.lesgo.servicesS3ServiceMod.default = js.native
  
  inline def getObject(key: ObjectKey, bucketName: BucketName): js.Promise[GetObjectOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(key.asInstanceOf[js.Any], bucketName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetObjectOutput]]
}
