package typings.libxslt

import typings.libxslt.internalTypesMod.OutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object libxsltStrings {
  @js.native
  sealed trait document extends OutputFormat
  
  @js.native
  sealed trait string extends OutputFormat
  
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

