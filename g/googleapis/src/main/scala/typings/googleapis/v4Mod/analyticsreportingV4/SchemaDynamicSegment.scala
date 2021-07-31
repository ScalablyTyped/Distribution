package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic segment definition for defining the segment within the request. A
  * segment can select users, sessions or both.
  */
trait SchemaDynamicSegment extends StObject {
  
  /**
    * The name of the dynamic segment.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Session Segment to select sessions to include in the segment.
    */
  var sessionSegment: js.UndefOr[SchemaSegmentDefinition] = js.undefined
  
  /**
    * User Segment to select users to include in the segment.
    */
  var userSegment: js.UndefOr[SchemaSegmentDefinition] = js.undefined
}
object SchemaDynamicSegment {
  
  @scala.inline
  def apply(): SchemaDynamicSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicSegment]
  }
  
  @scala.inline
  implicit class SchemaDynamicSegmentMutableBuilder[Self <: SchemaDynamicSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSessionSegment(value: SchemaSegmentDefinition): Self = StObject.set(x, "sessionSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionSegmentUndefined: Self = StObject.set(x, "sessionSegment", js.undefined)
    
    @scala.inline
    def setUserSegment(value: SchemaSegmentDefinition): Self = StObject.set(x, "userSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSegmentUndefined: Self = StObject.set(x, "userSegment", js.undefined)
  }
}
