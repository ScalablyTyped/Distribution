package typings.javascriptObfuscator

import typings.javascriptObfuscator.ioptionsMod.IOptions
import typings.javascriptObfuscator.javascriptObfuscatorStrings.compact
import typings.javascriptObfuscator.javascriptObfuscatorStrings.controlFlowFlattening
import typings.javascriptObfuscator.javascriptObfuscatorStrings.controlFlowFlatteningThreshold
import typings.javascriptObfuscator.javascriptObfuscatorStrings.deadCodeInjection
import typings.javascriptObfuscator.javascriptObfuscatorStrings.deadCodeInjectionThreshold
import typings.javascriptObfuscator.javascriptObfuscatorStrings.debugProtection
import typings.javascriptObfuscator.javascriptObfuscatorStrings.debugProtectionInterval
import typings.javascriptObfuscator.javascriptObfuscatorStrings.disableConsoleOutput
import typings.javascriptObfuscator.javascriptObfuscatorStrings.domainLock
import typings.javascriptObfuscator.javascriptObfuscatorStrings.identifierNamesGenerator
import typings.javascriptObfuscator.javascriptObfuscatorStrings.identifiersPrefix
import typings.javascriptObfuscator.javascriptObfuscatorStrings.inputFileName
import typings.javascriptObfuscator.javascriptObfuscatorStrings.log
import typings.javascriptObfuscator.javascriptObfuscatorStrings.renameGlobals
import typings.javascriptObfuscator.javascriptObfuscatorStrings.reservedNames
import typings.javascriptObfuscator.javascriptObfuscatorStrings.reservedStrings
import typings.javascriptObfuscator.javascriptObfuscatorStrings.rotateStringArray
import typings.javascriptObfuscator.javascriptObfuscatorStrings.seed
import typings.javascriptObfuscator.javascriptObfuscatorStrings.selfDefending
import typings.javascriptObfuscator.javascriptObfuscatorStrings.sourceMap
import typings.javascriptObfuscator.javascriptObfuscatorStrings.sourceMapBaseUrl
import typings.javascriptObfuscator.javascriptObfuscatorStrings.sourceMapFileName
import typings.javascriptObfuscator.javascriptObfuscatorStrings.sourceMapMode
import typings.javascriptObfuscator.javascriptObfuscatorStrings.stringArray
import typings.javascriptObfuscator.javascriptObfuscatorStrings.stringArrayEncoding
import typings.javascriptObfuscator.javascriptObfuscatorStrings.stringArrayThreshold
import typings.javascriptObfuscator.javascriptObfuscatorStrings.target
import typings.javascriptObfuscator.javascriptObfuscatorStrings.transformObjectKeys
import typings.javascriptObfuscator.javascriptObfuscatorStrings.unicodeEscapeSequence
import typings.javascriptObfuscator.tobjectMod.TObject
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/options/TInputOptions", JSImport.Namespace)
@js.native
object tinputoptionsMod extends js.Object {
  type TInputOptions = (Partial[
    Pick[
      IOptions, 
      compact | controlFlowFlattening | controlFlowFlatteningThreshold | deadCodeInjection | deadCodeInjectionThreshold | debugProtection | debugProtectionInterval | disableConsoleOutput | domainLock | identifierNamesGenerator | identifiersPrefix | inputFileName | log | renameGlobals | reservedNames | reservedStrings | rotateStringArray | seed | selfDefending | sourceMap | sourceMapBaseUrl | sourceMapFileName | sourceMapMode | stringArray | stringArrayEncoding | stringArrayThreshold | target | transformObjectKeys | unicodeEscapeSequence
    ]
  ]) with TObject[_]
}

