package typings.ipSubnetCalculator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip-subnet-calculator", "calculate")
  @js.native
  def calculate(ipStart: String, ipEnd: String): js.Array[SubnetResult] = js.native
  @JSImport("ip-subnet-calculator", "calculate")
  @js.native
  def calculate(ipStart: String, ipEnd: Double): js.Array[SubnetResult] = js.native
  @JSImport("ip-subnet-calculator", "calculate")
  @js.native
  def calculate(ipStart: Double, ipEnd: String): js.Array[SubnetResult] = js.native
  @JSImport("ip-subnet-calculator", "calculate")
  @js.native
  def calculate(ipStart: Double, ipEnd: Double): js.Array[SubnetResult] = js.native
  
  @JSImport("ip-subnet-calculator", "calculateCIDRPrefix")
  @js.native
  def calculateCIDRPrefix(ip: String, subnetMask: String): SubnetResult = js.native
  @JSImport("ip-subnet-calculator", "calculateCIDRPrefix")
  @js.native
  def calculateCIDRPrefix(ip: String, subnetMask: Double): SubnetResult = js.native
  @JSImport("ip-subnet-calculator", "calculateCIDRPrefix")
  @js.native
  def calculateCIDRPrefix(ip: Double, subnetMask: String): SubnetResult = js.native
  @JSImport("ip-subnet-calculator", "calculateCIDRPrefix")
  @js.native
  def calculateCIDRPrefix(ip: Double, subnetMask: Double): SubnetResult = js.native
  
  @JSImport("ip-subnet-calculator", "calculateSubnetMask")
  @js.native
  def calculateSubnetMask(ip: String, prefixSize: Double): SubnetResult = js.native
  @JSImport("ip-subnet-calculator", "calculateSubnetMask")
  @js.native
  def calculateSubnetMask(ip: Double, prefixSize: Double): SubnetResult = js.native
  
  @JSImport("ip-subnet-calculator", "isDecimalIp")
  @js.native
  def isDecimalIp(ipNum: Double): Boolean = js.native
  
  @JSImport("ip-subnet-calculator", "isIp")
  @js.native
  def isIp(ipStr: String): Boolean = js.native
  
  @JSImport("ip-subnet-calculator", "toDecimal")
  @js.native
  def toDecimal(ip: String): Double = js.native
  @JSImport("ip-subnet-calculator", "toDecimal")
  @js.native
  def toDecimal(ip: Double): Double = js.native
  
  @JSImport("ip-subnet-calculator", "toString")
  @js.native
  def toString_(num: String): String = js.native
  @JSImport("ip-subnet-calculator", "toString")
  @js.native
  def toString_(num: Double): String = js.native
  
  @js.native
  trait SubnetResult extends StObject {
    
    var invertedMask: Double = js.native
    
    var invertedMaskStr: String = js.native
    
    var invertedSize: Double = js.native
    
    var ipHigh: Double = js.native
    
    var ipHighStr: String = js.native
    
    var ipLow: Double = js.native
    
    var ipLowStr: String = js.native
    
    var prefixMask: Double = js.native
    
    var prefixMaskStr: String = js.native
    
    var prefixSize: Double = js.native
  }
  object SubnetResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SubnetResultMutableBuilder[Self <: SubnetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvertedMask(value: Double): Self = StObject.set(x, "invertedMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedMaskStr(value: String): Self = StObject.set(x, "invertedMaskStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedSize(value: Double): Self = StObject.set(x, "invertedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpHigh(value: Double): Self = StObject.set(x, "ipHigh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpHighStr(value: String): Self = StObject.set(x, "ipHighStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpLow(value: Double): Self = StObject.set(x, "ipLow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpLowStr(value: String): Self = StObject.set(x, "ipLowStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixMask(value: Double): Self = StObject.set(x, "prefixMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixMaskStr(value: String): Self = StObject.set(x, "prefixMaskStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixSize(value: Double): Self = StObject.set(x, "prefixSize", value.asInstanceOf[js.Any])
    }
  }
}
