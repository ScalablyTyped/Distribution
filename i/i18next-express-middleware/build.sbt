organization := "org.scalablytyped"
name := "i18next-express-middleware"
version := "1.8.2-b17a8d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8e8c0f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-34724c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-561191",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-51a4ff",
  "org.scalablytyped" %%% "i18next" % "17.3.1-ec2195",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-cc63ce",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        