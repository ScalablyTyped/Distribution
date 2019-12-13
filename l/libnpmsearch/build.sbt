organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-951d51"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191126Z-a09e0b",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-05808f",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-d74764",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-e26850",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-8d05a6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        