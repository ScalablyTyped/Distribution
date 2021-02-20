package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleapis.anon.ColumnId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the details of a column in a table.
  */
@js.native
trait SchemaColumn extends StObject {
  
  /**
    * Identifier of the base column. If present, this column is derived from
    * the specified base column.
    */
  var baseColumn: js.UndefOr[ColumnId] = js.native
  
  /**
    * Identifier for the column.
    */
  var columnId: js.UndefOr[Double] = js.native
  
  /**
    * JSON schema for interpreting JSON in this column.
    */
  var columnJsonSchema: js.UndefOr[String] = js.native
  
  /**
    * JSON object containing custom column properties.
    */
  var columnPropertiesJson: js.UndefOr[String] = js.native
  
  /**
    * Column description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Format pattern. Acceptable values are DT_DATE_MEDIUMe.g Dec 24, 2008
    * DT_DATE_SHORTfor example 12/24/08 DT_DATE_TIME_MEDIUMfor example Dec 24,
    * 2008 8:30:45 PM DT_DATE_TIME_SHORTfor example 12/24/08 8:30 PM
    * DT_DAY_MONTH_2_DIGIT_YEARfor example 24/12/08
    * DT_DAY_MONTH_2_DIGIT_YEAR_TIMEfor example 24/12/08 20:30
    * DT_DAY_MONTH_2_DIGIT_YEAR_TIME_MERIDIANfor example 24/12/08 8:30 PM
    * DT_DAY_MONTH_4_DIGIT_YEARfor example 24/12/2008
    * DT_DAY_MONTH_4_DIGIT_YEAR_TIMEfor example 24/12/2008 20:30
    * DT_DAY_MONTH_4_DIGIT_YEAR_TIME_MERIDIANfor example 24/12/2008 8:30 PM
    * DT_ISO_YEAR_MONTH_DAYfor example 2008-12-24 DT_ISO_YEAR_MONTH_DAY_TIMEfor
    * example 2008-12-24 20:30:45 DT_MONTH_DAY_4_DIGIT_YEARfor example
    * 12/24/2008 DT_TIME_LONGfor example 8:30:45 PM UTC-6 DT_TIME_MEDIUMfor
    * example 8:30:45 PM DT_TIME_SHORTfor example 8:30 PM DT_YEAR_ONLYfor
    * example 2008 HIGHLIGHT_UNTYPED_CELLSHighlight cell data that does not
    * match the data type NONENo formatting (default) NUMBER_CURRENCYfor
    * example $1234.56 NUMBER_DEFAULTfor example 1,234.56 NUMBER_INTEGERfor
    * example 1235 NUMBER_NO_SEPARATORfor example 1234.56 NUMBER_PERCENTfor
    * example 123,456% NUMBER_SCIENTIFICfor example 1E3
    * STRING_EIGHT_LINE_IMAGEDisplays thumbnail images as tall as eight lines
    * of text STRING_FOUR_LINE_IMAGEDisplays thumbnail images as tall as four
    * lines of text STRING_JSON_TEXTAllows editing of text as JSON in UI
    * STRING_JSON_LISTAllows editing of text as a JSON list in UI
    * STRING_LINKTreats cell as a link (must start with http:// or https://)
    * STRING_ONE_LINE_IMAGEDisplays thumbnail images as tall as one line of
    * text STRING_VIDEO_OR_MAPDisplay a video or map thumbnail
    */
  var formatPattern: js.UndefOr[String] = js.native
  
  /**
    * Column graph predicate. Used to map table to graph data model
    * (subject,predicate,object) See W3C Graph-based Data Model.
    */
  var graphPredicate: js.UndefOr[String] = js.native
  
  /**
    * The kind of item this is. For a column, this is always
    * fusiontables#column.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the column.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Type of the column.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * List of valid values used to validate data and supply a drop-down list of
    * values in the web application.
    */
  var validValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true, data entered via the web application is validated.
    */
  var validateData: js.UndefOr[Boolean] = js.native
}
object SchemaColumn {
  
  @scala.inline
  def apply(): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumn]
  }
  
  @scala.inline
  implicit class SchemaColumnMutableBuilder[Self <: SchemaColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseColumn(value: ColumnId): Self = StObject.set(x, "baseColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseColumnUndefined: Self = StObject.set(x, "baseColumn", js.undefined)
    
    @scala.inline
    def setColumnId(value: Double): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    @scala.inline
    def setColumnJsonSchema(value: String): Self = StObject.set(x, "columnJsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnJsonSchemaUndefined: Self = StObject.set(x, "columnJsonSchema", js.undefined)
    
    @scala.inline
    def setColumnPropertiesJson(value: String): Self = StObject.set(x, "columnPropertiesJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesJsonUndefined: Self = StObject.set(x, "columnPropertiesJson", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFormatPattern(value: String): Self = StObject.set(x, "formatPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatPatternUndefined: Self = StObject.set(x, "formatPattern", js.undefined)
    
    @scala.inline
    def setGraphPredicate(value: String): Self = StObject.set(x, "graphPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphPredicateUndefined: Self = StObject.set(x, "graphPredicate", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidValues(value: js.Array[String]): Self = StObject.set(x, "validValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidValuesUndefined: Self = StObject.set(x, "validValues", js.undefined)
    
    @scala.inline
    def setValidValuesVarargs(value: String*): Self = StObject.set(x, "validValues", js.Array(value :_*))
    
    @scala.inline
    def setValidateData(value: Boolean): Self = StObject.set(x, "validateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateDataUndefined: Self = StObject.set(x, "validateData", js.undefined)
  }
}
