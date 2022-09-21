package typings.jsbi

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsbi", JSImport.Default)
  @js.native
  /* private */ open class default ()
    extends StObject
       with JSBI
  object default {
    
    @JSImport("jsbi", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def ADD_(x: Any, y: Any): String | Double | JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("ADD")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String | Double | JSBI]
    
    inline def BigInt(arg: String): JSBI = ^.asInstanceOf[js.Dynamic].applyDynamic("BigInt")(arg.asInstanceOf[js.Any]).asInstanceOf[JSBI]
    inline def BigInt(arg: js.Object): JSBI = ^.asInstanceOf[js.Dynamic].applyDynamic("BigInt")(arg.asInstanceOf[js.Any]).asInstanceOf[JSBI]
    inline def BigInt(arg: Boolean): JSBI = ^.asInstanceOf[js.Dynamic].applyDynamic("BigInt")(arg.asInstanceOf[js.Any]).asInstanceOf[JSBI]
    /* static member */
    inline def BigInt(arg: Double): JSBI = ^.asInstanceOf[js.Dynamic].applyDynamic("BigInt")(arg.asInstanceOf[js.Any]).asInstanceOf[JSBI]
    
    /* static member */
    inline def DataViewGetBigInt64(dataview: js.typedarray.DataView, byteOffset: Double): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewGetBigInt64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    inline def DataViewGetBigInt64(dataview: js.typedarray.DataView, byteOffset: Double, littleEndian: Boolean): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewGetBigInt64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def DataViewGetBigUint64(dataview: js.typedarray.DataView, byteOffset: Double): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewGetBigUint64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    inline def DataViewGetBigUint64(dataview: js.typedarray.DataView, byteOffset: Double, littleEndian: Boolean): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewGetBigUint64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def DataViewSetBigInt64(dataview: js.typedarray.DataView, byteOffset: Double, value: JSBI): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewSetBigInt64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DataViewSetBigInt64(dataview: js.typedarray.DataView, byteOffset: Double, value: JSBI, littleEndian: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewSetBigInt64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def DataViewSetBigUint64(dataview: js.typedarray.DataView, byteOffset: Double, value: JSBI): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewSetBigUint64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DataViewSetBigUint64(dataview: js.typedarray.DataView, byteOffset: Double, value: JSBI, littleEndian: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DataViewSetBigUint64")(dataview.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def EQ(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("EQ")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def GE(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("GE")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def GT(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("GT")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def LE(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LE")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def LT(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("LT")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def NE(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("NE")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def add(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def asIntN(n: Double, x: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("asIntN")(n.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def asUintN(n: Double, x: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("asUintN")(n.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def bitwiseAnd(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseAnd")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def bitwiseNot(x: JSBI): JSBI = ^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseNot")(x.asInstanceOf[js.Any]).asInstanceOf[JSBI]
    
    /* static member */
    inline def bitwiseOr(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseOr")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def bitwiseXor(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseXor")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def divide(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def equal(x: JSBI, y: JSBI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def exponentiate(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentiate")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def greaterThan(x: JSBI, y: JSBI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def greaterThanOrEqual(x: JSBI, y: JSBI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def leftShift(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("leftShift")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def lessThan(x: JSBI, y: JSBI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def lessThanOrEqual(x: JSBI, y: JSBI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def multiply(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def notEqual(x: JSBI, y: JSBI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def remainder(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("remainder")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def signedRightShift(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("signedRightShift")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def subtract(x: JSBI, y: JSBI): JSBI = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[JSBI]
    
    /* static member */
    inline def toNumber(x: JSBI): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def unaryMinus(x: JSBI): JSBI = ^.asInstanceOf[js.Dynamic].applyDynamic("unaryMinus")(x.asInstanceOf[js.Any]).asInstanceOf[JSBI]
    
    /* static member */
    inline def unsignedRightShift(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unsignedRightShift")().asInstanceOf[Unit]
  }
  
  @js.native
  trait JSBI
    extends StObject
       with Array[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ] {
    
    /* private */ var sign: Any = js.native
    
    def toDebugString(): String = js.native
    
    def toString(radix: Double): String = js.native
  }
}
