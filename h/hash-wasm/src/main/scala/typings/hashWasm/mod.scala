package typings.hashWasm

import typings.hashWasm.distLibArgon2Mod.Argon2VerifyOptions
import typings.hashWasm.distLibArgon2Mod.IArgon2Options
import typings.hashWasm.distLibBcryptMod.BcryptOptions
import typings.hashWasm.distLibBcryptMod.BcryptVerifyOptions
import typings.hashWasm.distLibKeccakMod.IValidBits
import typings.hashWasm.distLibPbkdf2Mod.IPBKDF2Options
import typings.hashWasm.distLibScryptMod.ScryptOptions
import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hash-wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adler32(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("adler32")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def argon2Verify(options: Argon2VerifyOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2Verify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def argon2d[T /* <: IArgon2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2d")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def argon2i[T /* <: IArgon2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2i")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def argon2id[T /* <: IArgon2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("argon2id")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def bcrypt[T /* <: BcryptOptions */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("bcrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def bcryptVerify(options: BcryptVerifyOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bcryptVerify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def blake2b(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def blake2b(data: IDataType, bits: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2b(data: IDataType, bits: Double, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2b(data: IDataType, bits: Unit, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def blake2s(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def blake2s(data: IDataType, bits: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2s(data: IDataType, bits: Double, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2s(data: IDataType, bits: Unit, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def blake3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def blake3(data: IDataType, bits: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake3(data: IDataType, bits: Double, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake3(data: IDataType, bits: Unit, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def crc32(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def crc32c(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32c")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def createAdler32(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdler32")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createBLAKE2b(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")().asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2b(bits: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2b(bits: Double, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2b(bits: Unit, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def createBLAKE2s(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")().asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2s(bits: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2s(bits: Double, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2s(bits: Unit, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def createBLAKE3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")().asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE3(bits: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE3(bits: Double, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE3(bits: Unit, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def createCRC32(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCRC32")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createCRC32C(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCRC32C")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createHMAC(hash: js.Promise[IHasher], key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHMAC")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def createKeccak(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeccak")().asInstanceOf[js.Promise[IHasher]]
  inline def createKeccak(bits: IValidBits): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeccak")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  
  inline def createMD4(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMD4")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createMD5(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMD5")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createRIPEMD160(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRIPEMD160")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createSHA1(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA1")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createSHA224(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA224")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createSHA256(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA256")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createSHA3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA3")().asInstanceOf[js.Promise[IHasher]]
  inline def createSHA3(bits: typings.hashWasm.distLibSha3Mod.IValidBits): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA3")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  
  inline def createSHA384(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA384")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createSHA512(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA512")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createSM3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSM3")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createWhirlpool(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWhirlpool")().asInstanceOf[js.Promise[IHasher]]
  
  inline def createXXHash128(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash128(seedLow: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")(seedLow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash128(seedLow: Double, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash128(seedLow: Unit, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def createXXHash3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash3(seedLow: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")(seedLow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash3(seedLow: Double, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash3(seedLow: Unit, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def createXXHash32(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash32")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash32(seed: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash32")(seed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  
  inline def createXXHash64(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash64(seedLow: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")(seedLow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash64(seedLow: Double, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash64(seedLow: Unit, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def keccak(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def keccak(data: IDataType, bits: IValidBits): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def md4(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("md4")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def md5(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def pbkdf2[T /* <: IPBKDF2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def ripemd160(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def scrypt[T /* <: ScryptOptions */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def sha1(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def sha224(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha224")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def sha256(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def sha3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha3(data: IDataType, bits: typings.hashWasm.distLibSha3Mod.IValidBits): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sha384(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def sha512(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def sm3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sm3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def whirlpool(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("whirlpool")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def xxhash128(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash128(data: IDataType, seedLow: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash128(data: IDataType, seedLow: Double, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash128(data: IDataType, seedLow: Unit, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def xxhash3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash3(data: IDataType, seedLow: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash3(data: IDataType, seedLow: Double, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash3(data: IDataType, seedLow: Unit, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def xxhash32(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash32")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash32(data: IDataType, seed: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash32")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def xxhash64(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash64(data: IDataType, seedLow: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash64(data: IDataType, seedLow: Double, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash64(data: IDataType, seedLow: Unit, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
