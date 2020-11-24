organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-21a747"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "form-data" % "3.0.0-8c69ed",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200515Z-1cf626",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20200515Z-2bddd6",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-920437",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-16dd34",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20200620Z-7fabbc",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
