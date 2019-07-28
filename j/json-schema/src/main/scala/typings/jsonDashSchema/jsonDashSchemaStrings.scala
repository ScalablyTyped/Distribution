package typings.jsonDashSchema

import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4TypeName
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6TypeName
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7TypeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsonDashSchemaStrings {
  @js.native
  sealed trait any
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
  
  @js.native
  sealed trait array
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
       with JSONSchema7TypeName
  
  @js.native
  sealed trait boolean
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
       with JSONSchema7TypeName
  
  @js.native
  sealed trait integer
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
       with JSONSchema7TypeName
  
  @js.native
  sealed trait `null`
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
       with JSONSchema7TypeName
  
  @js.native
  sealed trait number
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
       with JSONSchema7TypeName
  
  @js.native
  sealed trait `object`
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
       with JSONSchema7TypeName
  
  @js.native
  sealed trait string
    extends JSONSchema4TypeName
       with JSONSchema6TypeName
       with JSONSchema7TypeName
  
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

