package typings.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object handlebarsStrings {
  @js.native
  sealed trait KnownHelpers extends js.Object
  
  @js.native
  sealed trait blockHelperMissing extends BuiltinHelperName
  
  @js.native
  sealed trait each extends BuiltinHelperName
  
  @js.native
  sealed trait helperMissing extends BuiltinHelperName
  
  @js.native
  sealed trait `if` extends BuiltinHelperName
  
  @js.native
  sealed trait log extends BuiltinHelperName
  
  @js.native
  sealed trait lookup extends BuiltinHelperName
  
  @js.native
  sealed trait unless extends BuiltinHelperName
  
  @js.native
  sealed trait `with` extends BuiltinHelperName
  
  @scala.inline
  def KnownHelpers: KnownHelpers = "KnownHelpers".asInstanceOf[KnownHelpers]
  @scala.inline
  def blockHelperMissing: blockHelperMissing = "blockHelperMissing".asInstanceOf[blockHelperMissing]
  @scala.inline
  def each: each = "each".asInstanceOf[each]
  @scala.inline
  def helperMissing: helperMissing = "helperMissing".asInstanceOf[helperMissing]
  @scala.inline
  def `if`: `if` = "if".asInstanceOf[`if`]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def unless: unless = "unless".asInstanceOf[unless]
  @scala.inline
  def `with`: `with` = "with".asInstanceOf[`with`]
}

