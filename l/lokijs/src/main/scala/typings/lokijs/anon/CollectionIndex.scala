package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionIndex extends StObject {
  
  var collectionIndex: js.UndefOr[Double] = js.undefined
  
  var delimited: js.UndefOr[Boolean] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
}
object CollectionIndex {
  
  @scala.inline
  def apply(): CollectionIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionIndex]
  }
  
  @scala.inline
  implicit class CollectionIndexMutableBuilder[Self <: CollectionIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionIndex(value: Double): Self = StObject.set(x, "collectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIndexUndefined: Self = StObject.set(x, "collectionIndex", js.undefined)
    
    @scala.inline
    def setDelimited(value: Boolean): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
  }
}
