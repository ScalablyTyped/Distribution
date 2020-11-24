package typings.java.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// *NodeAPI* declares methods & members exported by the node java module.
@js.native
trait NodeAPI extends js.Object {
  
  var asyncOptions: AsyncOptions = js.native
  
  def callMethod(instance: js.Any, methodName: String, args: js.Array[_], callback: Callback[_]): Unit = js.native
  
  def callMethodSync(instance: js.Any, methodName: String, args: js.Any*): js.Any = js.native
  
  def callStaticMethod(className: String, methodName: String, args: (js.Any | Callback[_])*): Unit = js.native
  
  def callStaticMethodSync(className: String, methodName: String, args: js.Any*): js.Any = js.native
  
  var classpath: js.Array[String] = js.native
  
  def ensureJvm(): js.Promise[Unit] = js.native
  def ensureJvm(done: Callback[Unit]): Unit = js.native
  
  def getClassLoader(): js.Any = js.native
  
  def getStaticFieldValue(className: String, fieldName: String): js.Any = js.native
  
  def `import`(className: String): js.Any = js.native
  
  def instanceOf(javaObject: js.Any, className: String): Boolean = js.native
  
  def isJvmCreated(): Boolean = js.native
  
  var nativeBindingLocation: String = js.native
  
  def newArray[T](className: String, arg: js.Array[_]): js.Any = js.native
  
  def newByte(`val`: Double): js.Any = js.native
  
  def newChar(`val`: String): js.Any = js.native
  def newChar(`val`: Double): js.Any = js.native
  
  def newDouble(`val`: Double): js.Any = js.native
  
  def newFloat(`val`: Double): js.Any = js.native
  
  def newInstance(className: String, args: js.Any*): Unit = js.native
  
  def newInstanceP(className: String, args: js.Any*): js.Promise[_] = js.native
  
  def newInstanceSync(className: String, args: js.Any*): js.Any = js.native
  
  def newLong(`val`: Double): js.Any = js.native
  
  def newProxy(interfaceName: String, functions: ProxyFunctions): js.Any = js.native
  
  def newShort(`val`: Double): js.Any = js.native
  
  var options: js.Array[String] = js.native
  
  def registerClient(before: js.Function1[/* cb */ Callback[Unit], Unit]): Unit = js.native
  def registerClient(
    before: js.Function1[/* cb */ Callback[Unit], Unit],
    after: js.Function1[/* cb */ Callback[Unit], Unit]
  ): Unit = js.native
  
  def registerClientP(beforeP: js.Function0[js.Promise[Unit]]): Unit = js.native
  def registerClientP(beforeP: js.Function0[js.Promise[Unit]], afterP: js.Function0[js.Promise[Unit]]): Unit = js.native
  
  def setStaticFieldValue(className: String, fieldName: String, newValue: js.Any): Unit = js.native
}
