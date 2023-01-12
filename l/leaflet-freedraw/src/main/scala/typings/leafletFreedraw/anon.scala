package typings.leafletFreedraw

import typings.leafletFreedraw.mod.localAll
import typings.leafletFreedraw.mod.localAppend
import typings.leafletFreedraw.mod.localCreate
import typings.leafletFreedraw.mod.localDelete
import typings.leafletFreedraw.mod.localEdit
import typings.leafletFreedraw.mod.localEditAppend
import typings.leafletFreedraw.mod.localNone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofFreeDraw extends StObject {
    
    /**
      * Create edit delete and append polygons
      */
    val ALL: localAll
    
    /**
      * Append points to an existing polygon
      */
    val APPEND: localAppend
    
    /**
      * Create polygons
      */
    val CREATE: localCreate
    
    /**
      * Delete polygons
      */
    val DELETE: localDelete
    
    /**
      * Edit existing polygons
      */
    val EDIT: localEdit
    
    /**
      * Edit polygons and can append new points to an existing polygon
      */
    val EDIT_APPEND: localEditAppend
    
    /**
      * Deactivate FreeDraw
      */
    val NONE: localNone
  }
  object TypeofFreeDraw {
    
    inline def apply(
      ALL: localAll,
      APPEND: localAppend,
      CREATE: localCreate,
      DELETE: localDelete,
      EDIT: localEdit,
      EDIT_APPEND: localEditAppend,
      NONE: localNone
    ): TypeofFreeDraw = {
      val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], APPEND = APPEND.asInstanceOf[js.Any], CREATE = CREATE.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], EDIT = EDIT.asInstanceOf[js.Any], EDIT_APPEND = EDIT_APPEND.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofFreeDraw]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofFreeDraw] (val x: Self) extends AnyVal {
      
      inline def setALL(value: localAll): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      inline def setAPPEND(value: localAppend): Self = StObject.set(x, "APPEND", value.asInstanceOf[js.Any])
      
      inline def setCREATE(value: localCreate): Self = StObject.set(x, "CREATE", value.asInstanceOf[js.Any])
      
      inline def setDELETE(value: localDelete): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setEDIT(value: localEdit): Self = StObject.set(x, "EDIT", value.asInstanceOf[js.Any])
      
      inline def setEDIT_APPEND(value: localEditAppend): Self = StObject.set(x, "EDIT_APPEND", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: localNone): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    }
  }
}
