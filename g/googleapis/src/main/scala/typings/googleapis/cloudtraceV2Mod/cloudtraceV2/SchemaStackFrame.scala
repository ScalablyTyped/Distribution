package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single stack frame in a stack trace.
  */
@js.native
trait SchemaStackFrame extends js.Object {
  /**
    * The column number where the function call appears, if available. This is
    * important in JavaScript because of its anonymous functions.
    */
  var columnNumber: js.UndefOr[String] = js.native
  /**
    * The name of the source file where the function call appears (up to 256
    * bytes).
    */
  var fileName: js.UndefOr[SchemaTruncatableString] = js.native
  /**
    * The fully-qualified name that uniquely identifies the function or method
    * that is active in this frame (up to 1024 bytes).
    */
  var functionName: js.UndefOr[SchemaTruncatableString] = js.native
  /**
    * The line number in `file_name` where the function call appears.
    */
  var lineNumber: js.UndefOr[String] = js.native
  /**
    * The binary module from where the code was loaded.
    */
  var loadModule: js.UndefOr[SchemaModule] = js.native
  /**
    * An un-mangled function name, if `function_name` is
    * [mangled](http://www.avabodh.com/cxxin/namemangling.html). The name can
    * be fully-qualified (up to 1024 bytes).
    */
  var originalFunctionName: js.UndefOr[SchemaTruncatableString] = js.native
  /**
    * The version of the deployed source code (up to 128 bytes).
    */
  var sourceVersion: js.UndefOr[SchemaTruncatableString] = js.native
}

object SchemaStackFrame {
  @scala.inline
  def apply(): SchemaStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackFrame]
  }
  @scala.inline
  implicit class SchemaStackFrameOps[Self <: SchemaStackFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnNumber(value: String): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    @scala.inline
    def setFileName(value: SchemaTruncatableString): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFunctionName(value: SchemaTruncatableString): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setLineNumber(value: String): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    @scala.inline
    def setLoadModule(value: SchemaModule): Self = this.set("loadModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadModule: Self = this.set("loadModule", js.undefined)
    @scala.inline
    def setOriginalFunctionName(value: SchemaTruncatableString): Self = this.set("originalFunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalFunctionName: Self = this.set("originalFunctionName", js.undefined)
    @scala.inline
    def setSourceVersion(value: SchemaTruncatableString): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceVersion: Self = this.set("sourceVersion", js.undefined)
  }
  
}

