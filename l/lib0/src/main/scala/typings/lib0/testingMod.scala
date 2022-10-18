package typings.lib0

import org.scalablytyped.runtime.StringDictionary
import typings.lib0.lib0Booleans.`true`
import typings.lib0.prngMod.PRNG
import typings.std.HTMLCanvasElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("lib0/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/testing", "TestCase")
  @js.native
  open class TestCase protected () extends StObject {
    /**
      * @param {string} moduleName
      * @param {string} testName
      */
    def this(moduleName: String, testName: String) = this()
    
    var _prng: PRNG | Null = js.native
    
    var _seed: Double | Null = js.native
    
    /**
      * @type {string}
      */
    var moduleName: String = js.native
    
    /**
      * A PRNG for this test case. Use only this PRNG for randomness to make the test case reproducible.
      *
      * @type {prng.PRNG}
      */
    def prng: PRNG = js.native
    
    def resetSeed(): Unit = js.native
    
    /**
      * @type {number}
      */
    def seed: Double = js.native
    
    /**
      * @type {string}
      */
    var testName: String = js.native
  }
  
  inline def assert(condition: Boolean): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any]).asInstanceOf[`true`]
  inline def assert(condition: Boolean, message: String): `true` = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[`true`]
  
  inline def compare[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare[T](a: T, b: T, message: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare[T](
    a: T,
    b: T,
    message: String,
    customCompare: js.Function5[/* arg0 */ Any, /* arg1 */ T, /* arg2 */ T, /* arg3 */ String, /* arg4 */ Any, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], message.asInstanceOf[js.Any], customCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare[T](
    a: T,
    b: T,
    message: Null,
    customCompare: js.Function5[/* arg0 */ Any, /* arg1 */ T, /* arg2 */ T, /* arg3 */ String, /* arg4 */ Any, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], message.asInstanceOf[js.Any], customCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare[T](
    a: T,
    b: T,
    message: Unit,
    customCompare: js.Function5[/* arg0 */ Any, /* arg1 */ T, /* arg2 */ T, /* arg3 */ String, /* arg4 */ Any, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], message.asInstanceOf[js.Any], customCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareArrays[T](as: js.Array[T], bs: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(as.asInstanceOf[js.Any], bs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareArrays[T](as: js.Array[T], bs: js.Array[T], m: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareArrays")(as.asInstanceOf[js.Any], bs.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareObjects[K, V](a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compareObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compareObjects[K, V](a: Any, b: Any, m: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compareObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compareStrings(a: String, b: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compareStrings(a: String, b: String, m: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compareStrings")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describe(description: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(description.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def describe(description: String, info: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(description.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("lib0/testing", "envSeed")
  @js.native
  val envSeed: Double | Null = js.native
  
  @JSImport("lib0/testing", "extensive")
  @js.native
  val extensive: Boolean = js.native
  
  inline def fail(reason: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(reason.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def fails(f: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fails")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def group(description: String, f: js.Function1[/* arg0 */ Unit, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(description.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def groupAsync(description: String, f: js.Function1[/* arg0 */ Unit, js.Promise[Any]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupAsync")(description.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def info(info: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(info.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def measureTime(message: String, f: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTime")(message.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def measureTimeAsync(message: String, f: js.Function0[js.Promise[Any]]): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTimeAsync")(message.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def printCanvas(canvas: HTMLCanvasElement, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printCanvas")(canvas.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printDom(createNode: js.Function0[Node]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printDom")(createNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("lib0/testing", "production")
  @js.native
  val production: Boolean = js.native
  
  @JSImport("lib0/testing", "repetitionTime")
  @js.native
  val repetitionTime: Double = js.native
  
  inline def run(
    moduleName: String,
    name: String,
    f: js.Function1[/* arg0 */ TestCase, Unit | js.Promise[Any]],
    i: Double,
    numberOfTests: Double
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(moduleName.asInstanceOf[js.Any], name.asInstanceOf[js.Any], f.asInstanceOf[js.Any], i.asInstanceOf[js.Any], numberOfTests.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def runTests(
    tests: StringDictionary[StringDictionary[js.Function1[/* arg0 */ TestCase, Unit | js.Promise[Any]]]]
  ): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runTests")(tests.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def skip(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")().asInstanceOf[Unit]
  inline def skip(cond: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(cond.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
