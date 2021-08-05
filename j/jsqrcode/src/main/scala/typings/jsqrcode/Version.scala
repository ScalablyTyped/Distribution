package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  val AlignmentPatternCenters: js.Array[Double]
  
  val DimensionForVersion: Double
  
  val TotalCodewords: Double
  
  val VersionNumber: Double
  
  var alignmentPatternCenters: js.Array[Double]
  
  def buildFunctionPattern(): BitMatrix
  
  var ecBlocks: js.Array[ECBlocks]
  
  def getECBlocksForLevel(ecLevel: ErrorCorrectionLevel): ECBlocks
  
  var versionNumber: Double
}
object Version {
  
  inline def apply(
    AlignmentPatternCenters: js.Array[Double],
    DimensionForVersion: Double,
    TotalCodewords: Double,
    VersionNumber: Double,
    alignmentPatternCenters: js.Array[Double],
    buildFunctionPattern: () => BitMatrix,
    ecBlocks: js.Array[ECBlocks],
    getECBlocksForLevel: ErrorCorrectionLevel => ECBlocks,
    versionNumber: Double
  ): Version = {
    val __obj = js.Dynamic.literal(AlignmentPatternCenters = AlignmentPatternCenters.asInstanceOf[js.Any], DimensionForVersion = DimensionForVersion.asInstanceOf[js.Any], TotalCodewords = TotalCodewords.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any], alignmentPatternCenters = alignmentPatternCenters.asInstanceOf[js.Any], buildFunctionPattern = js.Any.fromFunction0(buildFunctionPattern), ecBlocks = ecBlocks.asInstanceOf[js.Any], getECBlocksForLevel = js.Any.fromFunction1(getECBlocksForLevel), versionNumber = versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  extension [Self <: Version](x: Self) {
    
    inline def setAlignmentPatternCenters(value: js.Array[Double]): Self = StObject.set(x, "AlignmentPatternCenters", value.asInstanceOf[js.Any])
    
    inline def setAlignmentPatternCentersVarargs(value: Double*): Self = StObject.set(x, "AlignmentPatternCenters", js.Array(value :_*))
    
    inline def setBuildFunctionPattern(value: () => BitMatrix): Self = StObject.set(x, "buildFunctionPattern", js.Any.fromFunction0(value))
    
    inline def setDimensionForVersion(value: Double): Self = StObject.set(x, "DimensionForVersion", value.asInstanceOf[js.Any])
    
    inline def setEcBlocks(value: js.Array[ECBlocks]): Self = StObject.set(x, "ecBlocks", value.asInstanceOf[js.Any])
    
    inline def setEcBlocksVarargs(value: ECBlocks*): Self = StObject.set(x, "ecBlocks", js.Array(value :_*))
    
    inline def setGetECBlocksForLevel(value: ErrorCorrectionLevel => ECBlocks): Self = StObject.set(x, "getECBlocksForLevel", js.Any.fromFunction1(value))
    
    inline def setTotalCodewords(value: Double): Self = StObject.set(x, "TotalCodewords", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: Double): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}
