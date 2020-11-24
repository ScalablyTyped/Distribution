package typings.grpcProtoLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined protobufjs.protobufjs.IParseOptions & protobufjs.protobufjs.IConversionOptions & {  includeDirs :std.Array<string> | undefined} */
@js.native
trait Options extends js.Object {
  
  /** Recognize double-slash comments in addition to doc-block comments. */
  var alternateCommentMode: js.UndefOr[Boolean] = js.native
  
  /** Sets empty arrays for missing repeated fields even if `defaults=false` */
  var arrays: js.UndefOr[Boolean] = js.native
  
  /**
    * Bytes value conversion type.
    * Valid values are `Array` and (a base64 encoded) `String` (the global types).
    * Defaults to copy the present value, which usually is a Buffer under node and an Uint8Array in the browser.
    */
  var bytes: js.UndefOr[js.Function] = js.native
  
  /** Also sets default values on the resulting object */
  var defaults: js.UndefOr[Boolean] = js.native
  
  /**
    * Enum value conversion type.
    * Only valid value is `String` (the global type).
    * Defaults to copy the present value, which is the numeric id.
    */
  var enums: js.UndefOr[js.Function] = js.native
  
  var includeDirs: js.UndefOr[js.Array[String]] = js.native
  
  /** Performs additional JSON compatibility conversions, i.e. NaN and Infinity to strings */
  var json: js.UndefOr[Boolean] = js.native
  
  /** Keeps field casing instead of converting to camel case */
  var keepCase: js.UndefOr[Boolean] = js.native
  
  /**
    * Long conversion type.
    * Valid values are `String` and `Number` (the global types).
    * Defaults to copy the present value, which is a possibly unsafe number without and a {@link Long} with a long library.
    */
  var longs: js.UndefOr[js.Function] = js.native
  
  /** Sets empty objects for missing map fields even if `defaults=false` */
  var objects: js.UndefOr[Boolean] = js.native
  
  /** Includes virtual oneof properties set to the present field's name, if any */
  var oneofs: js.UndefOr[Boolean] = js.native
  
  /** Use trailing comment when both leading comment and trailing comment exist. */
  var preferTrailingComment: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAlternateCommentMode(value: Boolean): Self = this.set("alternateCommentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateCommentMode: Self = this.set("alternateCommentMode", js.undefined)
    
    @scala.inline
    def setArrays(value: Boolean): Self = this.set("arrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrays: Self = this.set("arrays", js.undefined)
    
    @scala.inline
    def setBytes(value: js.Function): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    
    @scala.inline
    def setDefaults(value: Boolean): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setEnums(value: js.Function): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    
    @scala.inline
    def setIncludeDirsVarargs(value: String*): Self = this.set("includeDirs", js.Array(value :_*))
    
    @scala.inline
    def setIncludeDirs(value: js.Array[String]): Self = this.set("includeDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDirs: Self = this.set("includeDirs", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setKeepCase(value: Boolean): Self = this.set("keepCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepCase: Self = this.set("keepCase", js.undefined)
    
    @scala.inline
    def setLongs(value: js.Function): Self = this.set("longs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongs: Self = this.set("longs", js.undefined)
    
    @scala.inline
    def setObjects(value: Boolean): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    
    @scala.inline
    def setOneofs(value: Boolean): Self = this.set("oneofs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneofs: Self = this.set("oneofs", js.undefined)
    
    @scala.inline
    def setPreferTrailingComment(value: Boolean): Self = this.set("preferTrailingComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferTrailingComment: Self = this.set("preferTrailingComment", js.undefined)
  }
}
