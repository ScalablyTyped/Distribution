package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleapis.anon.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a StyleFunction within a StyleSetting
  */
trait SchemaStyleFunction extends StObject {
  
  /**
    * Bucket function that assigns a style based on the range a column value
    * falls into.
    */
  var buckets: js.UndefOr[js.Array[SchemaBucket]] = js.undefined
  
  /**
    * Name of the column whose value is used in the style.
    */
  var columnName: js.UndefOr[String] = js.undefined
  
  /**
    * Gradient function that interpolates a range of colors based on column
    * value.
    */
  var gradient: js.UndefOr[Colors] = js.undefined
  
  /**
    * Stylers can be one of three kinds: &quot;fusiontables#fromColumn if the
    * column value is to be used as is, i.e., the column values can have colors
    * in #RRGGBBAA format or integer line widths or icon names;
    * fusiontables#gradient if the styling of the row is to be based on
    * applying the gradient function on the column value; or
    * fusiontables#buckets if the styling is to based on the bucket into which
    * the the column value falls.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaStyleFunction {
  
  @scala.inline
  def apply(): SchemaStyleFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStyleFunction]
  }
  
  @scala.inline
  implicit class SchemaStyleFunctionMutableBuilder[Self <: SchemaStyleFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[SchemaBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: SchemaBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    @scala.inline
    def setGradient(value: Colors): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
