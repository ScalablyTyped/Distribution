package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "Type")
@js.native
open class Type_[A, O, I] protected ()
  extends StObject
     with Decoder[I, A]
     with Encoder[A, O] {
  def this(
    /** a unique name for this codec */
  name: String,
    /** a custom type guard */
  is: Is[A],
    /** succeeds if a value of type I can be decoded to a value of type A */
  validate: Validate[I, A],
    /** converts a value of type A to a value of type O */
  encode: Encode[A, O]
  ) = this()
  
  /**
    * @since 1.0.0
    */
  val _A: A = js.native
  
  /**
    * @since 1.0.0
    */
  val _I: I = js.native
  
  /**
    * @since 1.0.0
    */
  val _O: O = js.native
  
  /**
    * @since 1.0.0
    */
  def asDecoder(): Decoder[I, A] = js.native
  
  /**
    * @since 1.0.0
    */
  def asEncoder(): Encoder[A, O] = js.native
  
  /* CompleteClass */
  override def decode(i: I): Validation[A] = js.native
  
  /* CompleteClass */
  override def encode(a: A): O = js.native
  
  /** a custom type guard */
  def is(u: Any): /* is A */ Boolean = js.native
  
  /* CompleteClass */
  override val name: String = js.native
  
  /**
    * @since 1.0.0
    */
  def pipe[B, IB, A /* <: IB */, OB /* <: A */](ab: Type_[B, OB, IB]): Type_[B, O, I] = js.native
  def pipe[B, IB, A /* <: IB */, OB /* <: A */](ab: Type_[B, OB, IB], name: String): Type_[B, O, I] = js.native
  
  /* CompleteClass */
  override def validate(i: I, context: Context): Validation[A] = js.native
}
