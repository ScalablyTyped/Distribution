package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "TaggedUnionType")
@js.native
open class TaggedUnionType[Tag /* <: String */, CS /* <: js.Array[Mixed_] */, A, O, I] protected () extends UnionType[CS, A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], codecs: CS, tag: Tag) = this()
  
  val tag: Tag = js.native
}
