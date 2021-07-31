package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acl[T] extends StObject {
  
  var _id: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
  ] = js.undefined
  
  var acl: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['acl'] */ js.Any
  ] = js.undefined
}
object Acl {
  
  @scala.inline
  def apply[T](): Acl[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acl[T]]
  }
  
  @scala.inline
  implicit class AclMutableBuilder[Self <: Acl[?], T] (val x: Self & Acl[T]) extends AnyVal {
    
    @scala.inline
    def setAcl(value: /* import warning: importer.ImportType#apply Failed type conversion: T['acl'] */ js.Any): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def set_id(value: /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
