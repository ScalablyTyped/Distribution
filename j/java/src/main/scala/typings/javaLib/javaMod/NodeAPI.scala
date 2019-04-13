package typings
package javaLib.javaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// *NodeAPI* declares methods & members exported by the node java module.
@js.native
trait NodeAPI extends js.Object {
  var asyncOptions: AsyncOptions = js.native
  var classpath: js.Array[java.lang.String] = js.native
  var nativeBindingLocation: java.lang.String = js.native
  var options: js.Array[java.lang.String] = js.native
  def callMethod(instance: js.Any, methodName: java.lang.String, args: js.Array[_], callback: Callback[_]): scala.Unit = js.native
  def callMethodSync(instance: js.Any, methodName: java.lang.String, args: js.Any*): js.Any = js.native
  def callStaticMethod(className: java.lang.String, methodName: java.lang.String, args: (js.Any | Callback[_])*): scala.Unit = js.native
  def callStaticMethodSync(className: java.lang.String, methodName: java.lang.String, args: js.Any*): js.Any = js.native
  def ensureJvm(): js.Promise[scala.Unit] = js.native
  def ensureJvm(done: Callback[scala.Unit]): scala.Unit = js.native
  def getClassLoader(): js.Any = js.native
  def getStaticFieldValue(className: java.lang.String, fieldName: java.lang.String): js.Any = js.native
  def `import`(className: java.lang.String): js.Any = js.native
  def instanceOf(javaObject: js.Any, className: java.lang.String): scala.Boolean = js.native
  def isJvmCreated(): scala.Boolean = js.native
  def newArray[T](className: java.lang.String, arg: js.Array[_]): js.Any = js.native
  def newByte(`val`: scala.Double): js.Any = js.native
  def newChar(`val`: java.lang.String): js.Any = js.native
  def newChar(`val`: scala.Double): js.Any = js.native
  def newDouble(`val`: scala.Double): js.Any = js.native
  def newFloat(`val`: scala.Double): js.Any = js.native
  def newInstance(className: java.lang.String, args: js.Any*): scala.Unit = js.native
  def newInstanceP(className: java.lang.String, args: js.Any*): js.Promise[_] = js.native
  def newInstanceSync(className: java.lang.String, args: js.Any*): js.Any = js.native
  def newLong(`val`: scala.Double): js.Any = js.native
  def newProxy(interfaceName: java.lang.String, functions: ProxyFunctions): js.Any = js.native
  def newShort(`val`: scala.Double): js.Any = js.native
  def registerClient(before: js.Function1[/* cb */ Callback[scala.Unit], scala.Unit]): scala.Unit = js.native
  def registerClient(
    before: js.Function1[/* cb */ Callback[scala.Unit], scala.Unit],
    after: js.Function1[/* cb */ Callback[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def registerClientP(beforeP: js.Function0[js.Promise[scala.Unit]]): scala.Unit = js.native
  def registerClientP(beforeP: js.Function0[js.Promise[scala.Unit]], afterP: js.Function0[js.Promise[scala.Unit]]): scala.Unit = js.native
  def setStaticFieldValue(className: java.lang.String, fieldName: java.lang.String, newValue: js.Any): scala.Unit = js.native
}

