organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-781cc9"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20190923Z-40e77f",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-494cd8",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-b32740",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-7a95ae",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-8d143a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        