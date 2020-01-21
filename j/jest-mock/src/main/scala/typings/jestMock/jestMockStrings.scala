package typings.jestMock

import typings.jestMock.mod.MockFunctionMetadataType
import typings.jestMock.mod.MockFunctionResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jestMockStrings {
  @js.native
  sealed trait array extends MockFunctionMetadataType
  
  @js.native
  sealed trait collection extends MockFunctionMetadataType
  
  @js.native
  sealed trait constant extends MockFunctionMetadataType
  
  @js.native
  sealed trait function extends MockFunctionMetadataType
  
  @js.native
  sealed trait get extends js.Object
  
  @js.native
  sealed trait incomplete extends MockFunctionResultType
  
  @js.native
  sealed trait `null` extends MockFunctionMetadataType
  
  @js.native
  sealed trait `object` extends MockFunctionMetadataType
  
  @js.native
  sealed trait regexp extends MockFunctionMetadataType
  
  @js.native
  sealed trait `return` extends MockFunctionResultType
  
  @js.native
  sealed trait set extends js.Object
  
  @js.native
  sealed trait `throw` extends MockFunctionResultType
  
  @js.native
  sealed trait undefined extends MockFunctionMetadataType
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def collection: collection = "collection".asInstanceOf[collection]
  @scala.inline
  def constant: constant = "constant".asInstanceOf[constant]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def regexp: regexp = "regexp".asInstanceOf[regexp]
  @scala.inline
  def `return`: `return` = "return".asInstanceOf[`return`]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def `throw`: `throw` = "throw".asInstanceOf[`throw`]
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
}

