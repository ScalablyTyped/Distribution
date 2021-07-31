package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a found unused range.
  */
trait SchemaRange extends StObject {
  
  /**
    * CIDR range in &quot;10.x.x.x/y&quot; format that is within the allocated
    * ranges and currently unused.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * In the Shared VPC host project, the VPC network that&#39;s peered with
    * the consumer network. For example:
    * `projects/1234321/global/networks/host-network`
    */
  var network: js.UndefOr[String] = js.undefined
}
object SchemaRange {
  
  @scala.inline
  def apply(): SchemaRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRange]
  }
  
  @scala.inline
  implicit class SchemaRangeMutableBuilder[Self <: SchemaRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
