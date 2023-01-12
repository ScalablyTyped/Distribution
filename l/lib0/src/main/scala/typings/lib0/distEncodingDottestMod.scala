package typings.lib0

import typings.lib0.distDecodingMod.Decoder
import typings.lib0.distEncodingMod.Encoder
import typings.lib0.distPrngMod.PRNG
import typings.lib0.distTestingMod.TestCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodingDottestMod {
  
  @JSImport("lib0/dist/encoding.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testAnyEncodeDate(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testAnyEncodeDate")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testAnyEncodeUnknowns(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testAnyEncodeUnknowns")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testAnyVsJsonEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testAnyVsJsonEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testCloneDecoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testCloneDecoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testDecodingPerformanceNativeVsPolyfill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testDecodingPerformanceNativeVsPolyfill")().asInstanceOf[Unit]
  
  inline def testEncodeMax32bitUint(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testEncodeMax32bitUint")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testGolangBinaryEncodingCompatibility(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testGolangBinaryEncodingCompatibility")().asInstanceOf[Unit]
  
  inline def testIntDiffEncoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testIntDiffEncoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testIntDiffRleEncoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testIntDiffRleEncoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testIntEncoders(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testIntEncoders")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testLargeNumberAnyEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testLargeNumberAnyEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testOverflowStringDecoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testOverflowStringDecoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeanntAnyEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeanntAnyEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatPeekVarIntEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatPeekVarIntEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatPeekVarUintEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatPeekVarUintEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatRandomWrites(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatRandomWrites")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatStringEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatStringEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatVarIntEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatVarIntEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatVarIntEncoding53bit(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatVarIntEncoding53bit")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatVarUintEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatVarUintEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRepeatVarUintEncoding53bit(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepeatVarUintEncoding53bit")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRleEncoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRleEncoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testRleIntDiffEncoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testRleIntDiffEncoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testSetMethods(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testSetMethods")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testSetOnOverflow(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testSetOnOverflow")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testStringDecoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testStringDecoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testStringDecodingPerformance(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testStringDecodingPerformance")().asInstanceOf[Unit]
  
  inline def testStringEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testStringEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testStringEncodingPerformanceNativeVsPolyfill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testStringEncodingPerformanceNativeVsPolyfill")().asInstanceOf[Unit]
  
  inline def testUintOptRleEncoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testUintOptRleEncoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testVarIntEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testVarIntEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testVarUintEncoding(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testVarUintEncoding")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testVerifyLen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testVerifyLen")().asInstanceOf[Unit]
  
  inline def testWriteBinaryEncoder(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testWriteBinaryEncoder")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def testWriteUint8ArrayOverflow(tc: TestCase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("testWriteUint8ArrayOverflow")(tc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait EncodingPair extends StObject {
    
    def compare(arg0: Any, arg1: Any): Boolean
    
    def gen(arg0: PRNG): Any
    
    var name: String
    
    def read(arg0: Decoder): Any
    
    def write(arg0: Encoder, arg1: Any): Unit
  }
  object EncodingPair {
    
    inline def apply(
      compare: (Any, Any) => Boolean,
      gen: PRNG => Any,
      name: String,
      read: Decoder => Any,
      write: (Encoder, Any) => Unit
    ): EncodingPair = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), gen = js.Any.fromFunction1(gen), name = name.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), write = js.Any.fromFunction2(write))
      __obj.asInstanceOf[EncodingPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodingPair] (val x: Self) extends AnyVal {
      
      inline def setCompare(value: (Any, Any) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setGen(value: PRNG => Any): Self = StObject.set(x, "gen", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Decoder => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: (Encoder, Any) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
}
