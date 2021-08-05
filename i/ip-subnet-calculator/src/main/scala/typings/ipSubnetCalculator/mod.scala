package typings.ipSubnetCalculator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip-subnet-calculator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculate(ipStart: String, ipEnd: String): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
  inline def calculate(ipStart: String, ipEnd: Double): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
  inline def calculate(ipStart: Double, ipEnd: String): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
  inline def calculate(ipStart: Double, ipEnd: Double): js.Array[SubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(ipStart.asInstanceOf[js.Any], ipEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[SubnetResult]]
  
  inline def calculateCIDRPrefix(ip: String, subnetMask: String): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
  inline def calculateCIDRPrefix(ip: String, subnetMask: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
  inline def calculateCIDRPrefix(ip: Double, subnetMask: String): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
  inline def calculateCIDRPrefix(ip: Double, subnetMask: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCIDRPrefix")(ip.asInstanceOf[js.Any], subnetMask.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
  
  inline def calculateSubnetMask(ip: String, prefixSize: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSubnetMask")(ip.asInstanceOf[js.Any], prefixSize.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
  inline def calculateSubnetMask(ip: Double, prefixSize: Double): SubnetResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSubnetMask")(ip.asInstanceOf[js.Any], prefixSize.asInstanceOf[js.Any])).asInstanceOf[SubnetResult]
  
  inline def isDecimalIp(ipNum: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimalIp")(ipNum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIp(ipStr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIp")(ipStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toDecimal(ip: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(ip.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toDecimal(ip: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(ip.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toString_(num: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait SubnetResult extends StObject {
    
    var invertedMask: Double
    
    var invertedMaskStr: String
    
    var invertedSize: Double
    
    var ipHigh: Double
    
    var ipHighStr: String
    
    var ipLow: Double
    
    var ipLowStr: String
    
    var prefixMask: Double
    
    var prefixMaskStr: String
    
    var prefixSize: Double
  }
  object SubnetResult {
    
    inline def apply(
      invertedMask: Double,
      invertedMaskStr: String,
      invertedSize: Double,
      ipHigh: Double,
      ipHighStr: String,
      ipLow: Double,
      ipLowStr: String,
      prefixMask: Double,
      prefixMaskStr: String,
      prefixSize: Double
    ): SubnetResult = {
      val __obj = js.Dynamic.literal(invertedMask = invertedMask.asInstanceOf[js.Any], invertedMaskStr = invertedMaskStr.asInstanceOf[js.Any], invertedSize = invertedSize.asInstanceOf[js.Any], ipHigh = ipHigh.asInstanceOf[js.Any], ipHighStr = ipHighStr.asInstanceOf[js.Any], ipLow = ipLow.asInstanceOf[js.Any], ipLowStr = ipLowStr.asInstanceOf[js.Any], prefixMask = prefixMask.asInstanceOf[js.Any], prefixMaskStr = prefixMaskStr.asInstanceOf[js.Any], prefixSize = prefixSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubnetResult]
    }
    
    extension [Self <: SubnetResult](x: Self) {
      
      inline def setInvertedMask(value: Double): Self = StObject.set(x, "invertedMask", value.asInstanceOf[js.Any])
      
      inline def setInvertedMaskStr(value: String): Self = StObject.set(x, "invertedMaskStr", value.asInstanceOf[js.Any])
      
      inline def setInvertedSize(value: Double): Self = StObject.set(x, "invertedSize", value.asInstanceOf[js.Any])
      
      inline def setIpHigh(value: Double): Self = StObject.set(x, "ipHigh", value.asInstanceOf[js.Any])
      
      inline def setIpHighStr(value: String): Self = StObject.set(x, "ipHighStr", value.asInstanceOf[js.Any])
      
      inline def setIpLow(value: Double): Self = StObject.set(x, "ipLow", value.asInstanceOf[js.Any])
      
      inline def setIpLowStr(value: String): Self = StObject.set(x, "ipLowStr", value.asInstanceOf[js.Any])
      
      inline def setPrefixMask(value: Double): Self = StObject.set(x, "prefixMask", value.asInstanceOf[js.Any])
      
      inline def setPrefixMaskStr(value: String): Self = StObject.set(x, "prefixMaskStr", value.asInstanceOf[js.Any])
      
      inline def setPrefixSize(value: Double): Self = StObject.set(x, "prefixSize", value.asInstanceOf[js.Any])
    }
  }
}
