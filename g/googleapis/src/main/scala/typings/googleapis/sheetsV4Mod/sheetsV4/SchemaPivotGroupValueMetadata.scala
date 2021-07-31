package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata about a value in a pivot grouping.
  */
trait SchemaPivotGroupValueMetadata extends StObject {
  
  /**
    * True if the data corresponding to the value is collapsed.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The calculated value the metadata corresponds to. (Note that formulaValue
    * is not valid,  because the values will be calculated.)
    */
  var value: js.UndefOr[SchemaExtendedValue] = js.undefined
}
object SchemaPivotGroupValueMetadata {
  
  @scala.inline
  def apply(): SchemaPivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupValueMetadata]
  }
  
  @scala.inline
  implicit class SchemaPivotGroupValueMetadataMutableBuilder[Self <: SchemaPivotGroupValueMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaExtendedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
