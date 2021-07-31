package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relations extends StObject {
  
  var dataSource: js.Any
  
  var relations: js.UndefOr[js.Any] = js.undefined
}
object Relations {
  
  @scala.inline
  def apply(dataSource: js.Any): Relations = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relations]
  }
  
  @scala.inline
  implicit class RelationsMutableBuilder[Self <: Relations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelations(value: js.Any): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
  }
}
