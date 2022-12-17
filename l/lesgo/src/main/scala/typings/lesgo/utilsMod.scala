package typings.lesgo

import typings.awsSdk.clientsS3Mod.BucketName
import typings.awsSdk.clientsS3Mod.GetObjectOutput
import typings.awsSdk.clientsS3Mod.ObjectKey
import typings.awsSdk.clientsSqsMod.SendMessageResult
import typings.lesgo.anon.Length
import typings.lesgo.anon.Sub
import typings.lesgo.servicesAuroraDbServiceMod.default
import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("lesgo/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lesgo/utils", "db")
  @js.native
  val db: default | typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default = js.native
  
  inline def decrypt(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def del(key: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def dispatch(payload: Any, queueName: String): js.Promise[SendMessageResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(payload.asInstanceOf[js.Any], queueName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendMessageResult]]
  
  @JSImport("lesgo/utils", "dynamodb")
  @js.native
  val dynamodb: typings.lesgo.servicesDynamoDbServiceMod.default = js.native
  
  inline def ec(): typings.memcached.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("ec")().asInstanceOf[typings.memcached.mod.^]
  inline def ec(conn: String): typings.memcached.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("ec")(conn.asInstanceOf[js.Any]).asInstanceOf[typings.memcached.mod.^]
  
  inline def encrypt(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def es(conn: String): typings.lesgo.servicesElasticsearchServiceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("es")(conn.asInstanceOf[js.Any]).asInstanceOf[typings.lesgo.servicesElasticsearchServiceMod.default]
  
  inline def generateUid(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUid")().asInstanceOf[js.Promise[String]]
  inline def generateUid(params: Length): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUid")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def get(key: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getObject(key: ObjectKey, bucketName: BucketName): js.Promise[GetObjectOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(key.asInstanceOf[js.Any], bucketName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetObjectOutput]]
  
  inline def getTokenData(authHeader: String): Sub = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenData")(authHeader.asInstanceOf[js.Any]).asInstanceOf[Sub]
  
  inline def hash(data: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashMD5(data: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMD5")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isDecimal(a: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Boolean]
  inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("lesgo/utils", "logger")
  @js.native
  val logger: typings.lesgo.servicesLoggerServiceMod.default = js.native
  
  inline def set(key: String, `val`: Any, lifetime: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], lifetime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
