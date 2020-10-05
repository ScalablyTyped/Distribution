organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.9.1-697906"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20200708Z-5b75fc",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b0fb5c",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20200515Z-71995d",
  "org.scalablytyped" %%% "jss" % "10.3.0-01787b",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-0f23fe",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-16cddc",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-0ac557",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-f69275",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-695c73",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
