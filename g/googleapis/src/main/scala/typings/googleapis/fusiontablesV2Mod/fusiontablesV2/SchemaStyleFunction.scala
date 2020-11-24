package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleapis.anon.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a StyleFunction within a StyleSetting
  */
@js.native
trait SchemaStyleFunction extends js.Object {
  
  /**
    * Bucket function that assigns a style based on the range a column value
    * falls into.
    */
  var buckets: js.UndefOr[js.Array[SchemaBucket]] = js.native
  
  /**
    * Name of the column whose value is used in the style.
    */
  var columnName: js.UndefOr[String] = js.native
  
  /**
    * Gradient function that interpolates a range of colors based on column
    * value.
    */
  var gradient: js.UndefOr[Colors] = js.native
  
  /**
    * Stylers can be one of three kinds: &quot;fusiontables#fromColumn if the
    * column value is to be used as is, i.e., the column values can have colors
    * in #RRGGBBAA format or integer line widths or icon names;
    * fusiontables#gradient if the styling of the row is to be based on
    * applying the gradient function on the column value; or
    * fusiontables#buckets if the styling is to based on the bucket into which
    * the the column value falls.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaStyleFunction {
  
  @scala.inline
  def apply(): SchemaStyleFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStyleFunction]
  }
  
  @scala.inline
  implicit class SchemaStyleFunctionOps[Self <: SchemaStyleFunction] (val x: Self) extends AnyVal {
    
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
    def setBucketsVarargs(value: SchemaBucket*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaBucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    
    @scala.inline
    def setGradient(value: Colors): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
