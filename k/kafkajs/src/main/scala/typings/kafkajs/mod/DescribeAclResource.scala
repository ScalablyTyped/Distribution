package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAclResource
  extends StObject
     with AclResource {
  
  var acls: js.Array[Acl]
}
object DescribeAclResource {
  
  inline def apply(
    acls: js.Array[Acl],
    resourceName: String,
    resourcePatternType: ResourcePatternTypes,
    resourceType: AclResourceTypes
  ): DescribeAclResource = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourcePatternType = resourcePatternType.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAclResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAclResource] (val x: Self) extends AnyVal {
    
    inline def setAcls(value: js.Array[Acl]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    inline def setAclsVarargs(value: Acl*): Self = StObject.set(x, "acls", js.Array(value*))
  }
}
