package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  var bucket: js.Any
  
  var key: js.Any
  
  var secret: js.Any
}
object Bucket {
  
  @scala.inline
  def apply(bucket: js.Any, key: js.Any, secret: js.Any): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: js.Any): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: js.Any): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
