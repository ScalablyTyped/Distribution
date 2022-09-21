package typings.grpcGrpcJs

import typings.grpcGrpcJs.anyMod.Any
import typings.grpcGrpcJs.anyMod.AnyOutput
import typings.grpcGrpcJs.grpcGrpcJsStrings.other_address
import typings.grpcGrpcJs.grpcGrpcJsStrings.tcpip_address
import typings.grpcGrpcJs.grpcGrpcJsStrings.uds_address
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  trait Address extends StObject {
    
    var address: js.UndefOr[tcpip_address | uds_address | other_address] = js.undefined
    
    var other_address: js.UndefOr[grpcChannelzV1AddressOtherAddress | Null] = js.undefined
    
    var tcpip_address: js.UndefOr[grpcChannelzV1AddressTcpIpAddress | Null] = js.undefined
    
    var uds_address: js.UndefOr[grpcChannelzV1AddressUdsAddress | Null] = js.undefined
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: tcpip_address | uds_address | other_address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setOther_address(value: grpcChannelzV1AddressOtherAddress): Self = StObject.set(x, "other_address", value.asInstanceOf[js.Any])
      
      inline def setOther_addressNull: Self = StObject.set(x, "other_address", null)
      
      inline def setOther_addressUndefined: Self = StObject.set(x, "other_address", js.undefined)
      
      inline def setTcpip_address(value: grpcChannelzV1AddressTcpIpAddress): Self = StObject.set(x, "tcpip_address", value.asInstanceOf[js.Any])
      
      inline def setTcpip_addressNull: Self = StObject.set(x, "tcpip_address", null)
      
      inline def setTcpip_addressUndefined: Self = StObject.set(x, "tcpip_address", js.undefined)
      
      inline def setUds_address(value: grpcChannelzV1AddressUdsAddress): Self = StObject.set(x, "uds_address", value.asInstanceOf[js.Any])
      
      inline def setUds_addressNull: Self = StObject.set(x, "uds_address", null)
      
      inline def setUds_addressUndefined: Self = StObject.set(x, "uds_address", js.undefined)
    }
  }
  
  trait AddressOutput extends StObject {
    
    var address: tcpip_address | uds_address | other_address
    
    var other_address: js.UndefOr[grpcChannelzV1AddressOtherAddressOutput | Null] = js.undefined
    
    var tcpip_address: js.UndefOr[grpcChannelzV1AddressTcpIpAddressOutput | Null] = js.undefined
    
    var uds_address: js.UndefOr[grpcChannelzV1AddressUdsAddressOutput | Null] = js.undefined
  }
  object AddressOutput {
    
    inline def apply(address: tcpip_address | uds_address | other_address): AddressOutput = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressOutput]
    }
    
    extension [Self <: AddressOutput](x: Self) {
      
      inline def setAddress(value: tcpip_address | uds_address | other_address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setOther_address(value: grpcChannelzV1AddressOtherAddressOutput): Self = StObject.set(x, "other_address", value.asInstanceOf[js.Any])
      
      inline def setOther_addressNull: Self = StObject.set(x, "other_address", null)
      
      inline def setOther_addressUndefined: Self = StObject.set(x, "other_address", js.undefined)
      
      inline def setTcpip_address(value: grpcChannelzV1AddressTcpIpAddressOutput): Self = StObject.set(x, "tcpip_address", value.asInstanceOf[js.Any])
      
      inline def setTcpip_addressNull: Self = StObject.set(x, "tcpip_address", null)
      
      inline def setTcpip_addressUndefined: Self = StObject.set(x, "tcpip_address", js.undefined)
      
      inline def setUds_address(value: grpcChannelzV1AddressUdsAddressOutput): Self = StObject.set(x, "uds_address", value.asInstanceOf[js.Any])
      
      inline def setUds_addressNull: Self = StObject.set(x, "uds_address", null)
      
      inline def setUds_addressUndefined: Self = StObject.set(x, "uds_address", js.undefined)
    }
  }
  
  trait grpcChannelzV1AddressOtherAddress extends StObject {
    
    /**
      * The human readable version of the value.  This value should be set.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The actual address message.
      */
    var value: js.UndefOr[Any | Null] = js.undefined
  }
  object grpcChannelzV1AddressOtherAddress {
    
    inline def apply(): grpcChannelzV1AddressOtherAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[grpcChannelzV1AddressOtherAddress]
    }
    
    extension [Self <: grpcChannelzV1AddressOtherAddress](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait grpcChannelzV1AddressOtherAddressOutput extends StObject {
    
    /**
      * The human readable version of the value.  This value should be set.
      */
    var name: String
    
    /**
      * The actual address message.
      */
    var value: AnyOutput | Null
  }
  object grpcChannelzV1AddressOtherAddressOutput {
    
    inline def apply(name: String): grpcChannelzV1AddressOtherAddressOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[grpcChannelzV1AddressOtherAddressOutput]
    }
    
    extension [Self <: grpcChannelzV1AddressOtherAddressOutput](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: AnyOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait grpcChannelzV1AddressTcpIpAddress extends StObject {
    
    /**
      * Either the IPv4 or IPv6 address in bytes.  Will be either 4 bytes or 16
      * bytes in length.
      */
    var ip_address: js.UndefOr[Buffer | js.typedarray.Uint8Array | String] = js.undefined
    
    /**
      * 0-64k, or -1 if not appropriate.
      */
    var port: js.UndefOr[Double] = js.undefined
  }
  object grpcChannelzV1AddressTcpIpAddress {
    
    inline def apply(): grpcChannelzV1AddressTcpIpAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[grpcChannelzV1AddressTcpIpAddress]
    }
    
    extension [Self <: grpcChannelzV1AddressTcpIpAddress](x: Self) {
      
      inline def setIp_address(value: Buffer | js.typedarray.Uint8Array | String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait grpcChannelzV1AddressTcpIpAddressOutput extends StObject {
    
    /**
      * Either the IPv4 or IPv6 address in bytes.  Will be either 4 bytes or 16
      * bytes in length.
      */
    var ip_address: Buffer
    
    /**
      * 0-64k, or -1 if not appropriate.
      */
    var port: Double
  }
  object grpcChannelzV1AddressTcpIpAddressOutput {
    
    inline def apply(ip_address: Buffer, port: Double): grpcChannelzV1AddressTcpIpAddressOutput = {
      val __obj = js.Dynamic.literal(ip_address = ip_address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[grpcChannelzV1AddressTcpIpAddressOutput]
    }
    
    extension [Self <: grpcChannelzV1AddressTcpIpAddressOutput](x: Self) {
      
      inline def setIp_address(value: Buffer): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait grpcChannelzV1AddressUdsAddress extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object grpcChannelzV1AddressUdsAddress {
    
    inline def apply(): grpcChannelzV1AddressUdsAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[grpcChannelzV1AddressUdsAddress]
    }
    
    extension [Self <: grpcChannelzV1AddressUdsAddress](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait grpcChannelzV1AddressUdsAddressOutput extends StObject {
    
    var filename: String
  }
  object grpcChannelzV1AddressUdsAddressOutput {
    
    inline def apply(filename: String): grpcChannelzV1AddressUdsAddressOutput = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[grpcChannelzV1AddressUdsAddressOutput]
    }
    
    extension [Self <: grpcChannelzV1AddressUdsAddressOutput](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
